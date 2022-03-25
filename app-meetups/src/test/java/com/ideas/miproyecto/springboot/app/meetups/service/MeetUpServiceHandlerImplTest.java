package com.ideas.miproyecto.springboot.app.meetups.service;

import com.ideas.miproyecto.springboot.app.meetups.model.entity.MeetUpList;
import com.ideas.miproyecto.springboot.app.meetups.model.entity.WeatherFinal;
import com.ideas.miproyecto.springboot.app.meetups.request.MeetUpRequest;
import com.ideas.miproyecto.springboot.app.meetups.response.BeerMeetUpResponse;
import com.ideas.miproyecto.springboot.app.meetups.response.MeetUpWeatherResponse;
import com.ideas.miproyecto.springboot.app.meetups.util.BeerMeetUp;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MeetUpServiceHandlerImplTest implements MeetUpServiceHandler {

    @Override
    public ResponseEntity createMeetUp(MeetUpRequest meetUpRequest) {
        return null;
    }

    @Override
    public MeetUpList getMeetUps() {
        return null;
    }

    @Override
    public MeetUpWeatherResponse getMeetUpWeather(Long meetUpId) throws Exception {
        return null;
    }

    @Override
    public BeerMeetUpResponse getBeerMeetUp(Long meetUpId) throws Exception {
        return null;
    }

    @TestConfiguration
    static class MeetUpServiceHandlerImplTestContextConfiguration {

        @Bean
        public MeetUpServiceHandlerImpl meetUpServiceHandler() {
            return new MeetUpServiceHandlerImpl();
        }

    }

    private List<WeatherFinal> weatherFinalList = new ArrayList<>();

    @BeforeEach
    public void init() {
        WeatherFinal weatherFinal = new WeatherFinal();
        weatherFinal.setMaximumTemperature(null);
        weatherFinal.setMinimunTemperature(24.0);
        weatherFinal.setAmountBeerByPerson(2.0);

        WeatherFinal weatherFinal1 = new WeatherFinal();
        weatherFinal1.setMaximumTemperature(20.0);
        weatherFinal1.setMinimunTemperature(null);
        weatherFinal1.setAmountBeerByPerson(0.75);

        WeatherFinal weatherFinal2 = new WeatherFinal();
        weatherFinal2.setMaximumTemperature(20.0);
        weatherFinal2.setMinimunTemperature(24.0);
        weatherFinal2.setAmountBeerByPerson(1.0);

        weatherFinalList.add(weatherFinal);
        weatherFinalList.add(weatherFinal1);
        weatherFinalList.add(weatherFinal2);

    }

    @AfterEach
    void tearDown() {
        System.out.println("finalizando el metodo de prueba.");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("inicializando el test");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("finalizando el test");
    }

    @Autowired
    private MeetUpServiceHandlerImpl meetUpServiceHandlerImpl;

    @Autowired
    private MeetUpServiceHandler meetUpServiceHandler;


    @Test
    void createMeetUp() throws Exception {
        Double value = BeerMeetUp.calculateBeerByPerson(weatherFinalList, Double.valueOf(23));
        Double value1 = BeerMeetUp.calculateBeerByPerson(weatherFinalList, Double.valueOf(23));
        Double value2 = BeerMeetUp.calculateBeerByPerson(weatherFinalList, Double.valueOf(30));
        Double value3 = BeerMeetUp.calculateBeerByPerson(weatherFinalList, Double.valueOf(29));
        Double value4 = BeerMeetUp.calculateBeerByPerson(weatherFinalList, Double.valueOf(24));
        Double value5 = BeerMeetUp.calculateBeerByPerson(weatherFinalList, Double.valueOf(20));
        assertEquals(1, value);
        assertEquals(1, value1);
        assertEquals(2, value2);
        assertEquals(2, value3);
        assertEquals(1, value4);
        assertEquals(1, value5);

    }

    @Test
    void getMeetUpWeather() {
    }

    @Test
    void getBeerMeetUp() {
    }

    @Test
    void getWeather() {
    }

}