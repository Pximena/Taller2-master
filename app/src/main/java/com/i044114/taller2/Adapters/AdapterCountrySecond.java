package com.i044114.taller2.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.i044114.taller2.Models.Country;
import com.i044114.taller2.Models.CountryNew;
import com.i044114.taller2.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ACER on 26/09/2017.
 */

public class AdapterCountrySecond extends RecyclerView.Adapter<AdapterCountrySecond.ViewHolder> {
    List<CountryNew> countryNewList = new ArrayList<>();
    Context context;
    // Constructor de la clase
    public AdapterCountrySecond(List<CountryNew> countryNewList, Context context) {
        this.countryNewList = countryNewList;
        this.context = context;
    }
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
// Configuracion del ViewAdapter
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.segundoitem, parent, false);

        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textViewName.setText(countryNewList.get(position).getName());
        holder.textViewCapital.setText(countryNewList.get(position).getCapital());
        holder.textViewpopulation.setText(countryNewList.get(position).getPoblacion());
        holder.textViewcode.setText(countryNewList.get(position).getCodigo());
        holder.textViewarea.setText(countryNewList.get(position).getArea());
    }

    @Override
    public int getItemCount() {
        return countryNewList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textViewName;
        TextView textViewCapital;
        TextView textViewpopulation;
        TextView textViewcode;
        TextView textViewarea;
        public ViewHolder(View item) {
            super(item);
            textViewName = (TextView) item.findViewById(R.id.id_tv_item_namecountry);
            textViewCapital = (TextView) item.findViewById(R.id.id_tv_item_namecapital);
            textViewpopulation = (TextView) item.findViewById(R.id.id_tv_item_numberpopulation);
            textViewcode = (TextView) item.findViewById(R.id.id_tv_item_numbercode);
            textViewarea = (TextView) item.findViewById(R.id.id_tv_item_area);
        }
    }

}
