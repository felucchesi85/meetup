package com.ideas.miproyecto.springboot.app.meetups.model.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "weather_temp")
public class WeatherTemp implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private float min;
    private float max;
    private float eve;
    private float nigth;
    private float morn;
    private float day;
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getMin() {
        return min;
    }

    public void setMin(float min) {
        this.min = min;
    }

    public float getMax() {
        return max;
    }

    public void setMax(float max) {
        this.max = max;
    }

    public float getEve() {
        return eve;
    }

    public void setEve(float eve) {
        this.eve = eve;
    }

    public float getNigth() {
        return nigth;
    }

    public void setNigth(float nigth) {
        this.nigth = nigth;
    }

    public float getMorn() {
        return morn;
    }

    public void setMorn(float morn) {
        this.morn = morn;
    }

    public float getDay() {
        return day;
    }

    public void setDay(float day) {
        this.day = day;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "WeatherTemp{" +
                "id=" + id +
                ", min=" + min +
                ", max=" + max +
                ", eve=" + eve +
                ", nigth=" + nigth +
                ", morn=" + morn +
                ", day=" + day +
                '}';
    }
}
