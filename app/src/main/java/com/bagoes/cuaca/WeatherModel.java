package com.bagoes.cuaca;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WeatherModel
{
    private String main;
    private String deskripsi;
    private String icon;

    public WeatherModel(){
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
