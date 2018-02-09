package com.miguelrodriguezalonso.demojava;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Miguel Rodríguez Alonso on 3/2/18.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.list);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(new ForecastListAdapter(obtainData(), new ForecastItemClickListener(){
            @Override
            public void onClick(Forecast forecast) {
                startActivity(new Intent(getBaseContext(), DetailActivity.class));
            }
        }));
    }

    public List<Forecast> obtainData() {
        List<Forecast> forecastList = new ArrayList<>();
        forecastList.add(new Forecast("03/02/18", "Soleado", 6, 0));
        forecastList.add(new Forecast("04/02/18", "Nublado", 4, -1));
        forecastList.add(new Forecast("05/02/18", "Llovizna", 3, -2));
        return forecastList;
    }
}
