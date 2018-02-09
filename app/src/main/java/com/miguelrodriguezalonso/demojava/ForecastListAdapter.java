package com.miguelrodriguezalonso.demojava;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Miguel Rodríguez Alonso on 3/2/18.
 */

public class ForecastListAdapter extends RecyclerView.Adapter<ForecastViewHolder> {

    private List<Forecast> forecastList;
    private ForecastItemClickListener onClickListener;

    ForecastListAdapter(List<Forecast> forecastList, ForecastItemClickListener onClickListener){
        super();
        this.forecastList = forecastList;
        this.onClickListener = onClickListener;
    }

    @Override
    public ForecastViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_forecast, parent, false);
        return new ForecastViewHolder(view, onClickListener);
    }

    @Override
    public void onBindViewHolder(ForecastViewHolder holder, int position) {
        holder.bindForecast(forecastList.get(position));

    }

    @Override
    public int getItemCount() {
        return forecastList.size();
    }
}
