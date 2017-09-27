package com.i044114.taller2.Parser;

import com.i044114.taller2.Models.Country;
import com.i044114.taller2.Models.CountryNew;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ACER on 26/09/2017.
 */

public class JsonCountrySecond {
    public static List<CountryNew> getData(String content) throws JSONException {
        JSONArray jsonArray = new JSONArray(content);
        List<CountryNew> countryNewList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++){
            JSONObject item = jsonArray.getJSONObject(i);
            CountryNew countryNew = new CountryNew();
            countryNew.setName(item.getString("name"));
            countryNew.setCapital(item.getString("capital"));
            countryNew.setPoblacion(item.getString("population"));
            countryNew.setCodigo(item.getString("callingCodes"));
            countryNew.setArea(item.getString("area"));
            countryNewList.add(countryNew);
        }
        return countryNewList ;
    }
}
