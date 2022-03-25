package com.ideas.miproyecto.springboot.app.meetups.response;

import com.ideas.miproyecto.springboot.app.meetups.model.entity.Weather;

import java.util.List;

public class WeatherResponse {

    private List<Weather> list;

    public List<Weather> getList() {
        return list;
    }

    public void setList(List<Weather> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "WeatherResponse{" +
                "list=" + list +
                '}';
    }
}
