package com.miguelrodriguezalonso.demojava;

/**
 * Created by Miguel Rodríguez Alonso on 3/2/18.
 */

public class Forecast{

    private String date;
    private String description;
    private Integer high;
    private Integer low;

    public Forecast(String date, String description, Integer high, Integer low) {
        this.date = date;
        this.description = description;
        this.high = high;
        this.low = low;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public Integer getHigh() {
        return high;
    }

    public Integer getLow() {
        return low;
    }


}
