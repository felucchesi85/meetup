package com.ideas.miproyecto.springboot.app.meetups.util;

public enum Beer {

    BEER(1.0, 24.0, 20.0),
    TWOBEERS(2.0, null, 24.0),
    LESSBEER(0.75, 20.0, null);

    private final Double beers;
    private final Double max;
    private final Double min;

    Beer(Double beers, Double max, Double min) {
        this.beers = beers;
        this.max = max;
        this.min = min;
    }

    public Double getBeers() {
        return beers;
    }

    public Double getMax() {
        return max;
    }

    public Double getMin() {
        return min;
    }
}
