package com.miguelrodriguezalonso.demojava;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Miguel Rodríguez Alonso on 3/2/18.
 */

public class ForecastViewHolder extends RecyclerView.ViewHolder {

    private ForecastItemClickListener onClickListener;

    public ForecastViewHolder(View itemView, ForecastItemClickListener onClickListener) {
        super(itemView);
        this.onClickListener = onClickListener;
    }

    public void bindForecast(final Forecast forecast) {
        ((TextView) itemView.findViewById(R.id.date)).setText(forecast.getDate());
        ((TextView) itemView.findViewById(R.id.description)).setText(forecast.getDescription());
        ((TextView) itemView.findViewById(R.id.maxTemperature)).setText(String.format("%sº", forecast.getHigh()));
        ((TextView) itemView.findViewById(R.id.minTemperature)).setText(String.format("%sº", forecast.getLow()));
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickListener.onClick(forecast);
            }
        });
    }
}
