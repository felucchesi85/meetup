package com.ideas.miproyecto.springboot.app.meetups.response;

public class MeetUpWeatherResponse {

    private Double temperature;

    public MeetUpWeatherResponse() {
    }

    public MeetUpWeatherResponse(Double temperature) {
        this.temperature = temperature;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }
}
