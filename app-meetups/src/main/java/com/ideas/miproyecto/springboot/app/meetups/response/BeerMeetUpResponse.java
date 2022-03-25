package com.ideas.miproyecto.springboot.app.meetups.response;

public class BeerMeetUpResponse {

    private Double packsBeers;
    private Double temperature;

    public BeerMeetUpResponse() {
    }

    public BeerMeetUpResponse(Double packsBeers, Double temperature) {
        this.packsBeers = packsBeers;
        this.temperature = temperature;
    }

    public Double getPacksBeers() {
        return packsBeers;
    }

    public void setPacksBeers(Double packsBeers) {
        this.packsBeers = packsBeers;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }
}
