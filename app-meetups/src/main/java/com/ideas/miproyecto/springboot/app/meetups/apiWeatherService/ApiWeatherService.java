package com.ideas.miproyecto.springboot.app.meetups.apiWeatherService;

import com.ideas.miproyecto.springboot.app.meetups.response.WeatherResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class ApiWeatherService {
	//crear constantes 
    //private static final String WEATHER_SERVICE_URL = "https://community-open-weather-map.p.rapidapi.com/forecast/daily?q=argentina&ar&units=metric&cnt=16";
    //private static final String WEATHER_SERVICE_HOST = "community-open-weather-map.p.rapidapi.com";
	//private static final String WEATHER_KEY = "44b54dd540mshc0e00f47679e1b9p13b53djsn4c5ed21c43fd";

    public WeatherResponse getWeather() {
        HttpEntity<String> request = new HttpEntity<>("", getHeaders());
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<WeatherResponse> result = restTemplate.exchange(URI.create("https://community-open-weather-map.p.rapidapi.com/forecast/daily?q=argentina&ar&units=metric&cnt=16"), HttpMethod.GET,
                request, WeatherResponse.class);
        return result.getBody();
    }

    HttpHeaders getHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("x-rapidapi-host", "community-open-weather-map.p.rapidapi.com");
        headers.set("x-rapidapi-key", "44b54dd540mshc0e00f47679e1b9p13b53djsn4c5ed21c43fd");
        return headers;
    }
}

