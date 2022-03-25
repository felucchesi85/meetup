package com.ideas.miproyecto.springboot.app.meetups.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

@Entity
@Table(name = "weathers")
public class Weather implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long dt;
    private long sunrise;
    private long sunset;
    private WeatherTemp temp;
    private static final long serialVersionUID = 1L;

    public LocalDate getDate() {
        return Instant.ofEpochMilli(dt * 1000).atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public long getSunrise() {
        return sunrise;
    }

    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    public long getSunset() {
        return sunset;
    }

    public void setSunset(long sunset) {
        this.sunset = sunset;
    }

    public WeatherTemp getTemp() {
        return temp;
    }

    public void setTemp(WeatherTemp temp) {
        this.temp = temp;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "dt=" + dt +
                ", sunrise=" + sunrise +
                ", sunset=" + sunset +
                ", temp=" + temp +
                '}';
    }
}
