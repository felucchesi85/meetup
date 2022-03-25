package com.ideas.miproyecto.springboot.app.meetups.service;

import com.ideas.miproyecto.springboot.app.meetups.apiWeatherService.ApiWeatherService;
import com.ideas.miproyecto.springboot.app.meetups.model.entity.MeetUp;
import com.ideas.miproyecto.springboot.app.meetups.model.entity.MeetUpList;
import com.ideas.miproyecto.springboot.app.meetups.model.entity.Weather;
import com.ideas.miproyecto.springboot.app.meetups.model.repository.MeetUpRepository;
import com.ideas.miproyecto.springboot.app.meetups.model.repository.MemberAssistRepository;
import com.ideas.miproyecto.springboot.app.meetups.model.repository.MemberRepository;
import com.ideas.miproyecto.springboot.app.meetups.model.repository.WeatherRepository;
import com.ideas.miproyecto.springboot.app.meetups.request.MeetUpRequest;
import com.ideas.miproyecto.springboot.app.meetups.response.BeerMeetUpResponse;
import com.ideas.miproyecto.springboot.app.meetups.response.MeetUpWeatherResponse;
import com.ideas.miproyecto.springboot.app.meetups.response.WeatherResponse;
import com.ideas.miproyecto.springboot.app.meetups.util.BeerMeetUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.time.LocalDate;

@Service
public class MeetUpServiceHandlerImpl implements MeetUpServiceHandler {

    @Autowired
    private MeetUpRepository meetUpRepository;
    @Autowired
    private ApiWeatherService apiWeatherService;
    @Autowired
    private WeatherRepository weatherRepository;
    @Autowired
    private MemberAssistRepository memberAssistRepository;
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private BeerMeetUp beerMeetUp;
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    @Override
    public ResponseEntity createMeetUp(MeetUpRequest meetUpRequest) {
        MeetUp meetUp = new MeetUp(meetUpRequest.getDate(), meetUpRequest.getAddress());
        meetUpRepository.save(meetUp);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public MeetUpList getMeetUps() {
        return null;
    }

    @Override
    public MeetUpWeatherResponse getMeetUpWeather(Long meetUpId) throws Exception {
        MeetUpWeatherResponse meetUpWeatherResponse = new MeetUpWeatherResponse();
        if (!meetUpRepository.findById(meetUpId).isPresent()) {
            throw new Exception();
        }
        MeetUp meetUp = meetUpRepository.findById(meetUpId).get();
        meetUpWeatherResponse.setTemperature(getMeetUpWeather(meetUp.getDate()));
        return meetUpWeatherResponse;
    }

    @Override
    public BeerMeetUpResponse getBeerMeetUp(Long meetUpId) throws Exception {
        BeerMeetUpResponse beerMeetUpResponse = new BeerMeetUpResponse();
        if (!meetUpRepository.findById(meetUpId).isPresent()) {
            throw new Exception();
        }
        MeetUp meetUp = meetUpRepository.findById(meetUpId).get();
        int meetUpAssist = meetUp.getMemberAssists().size();
        Double meetUpWeather = getMeetUpWeather(meetUp.getDate());
        Double beersPack = BeerMeetUp.getMeetupBeer(meetUpWeather, meetUpAssist);
        beerMeetUpResponse.setPacksBeers(beersPack);
        beerMeetUpResponse.setTemperature(meetUpWeather);

        return beerMeetUpResponse;
    }

    public Double getBeers(Long meetUpId) throws Exception {
        if (!meetUpRepository.findById(meetUpId).isPresent()) {
            throw new Exception();
        }
        MeetUp meetUp = meetUpRepository.findById(meetUpId).get();
        Double meetUpWeather = getMeetUpWeather(meetUp.getDate());
        Double beers = BeerMeetUp.getBeersNumber(meetUpWeather);

        return beers;
    }


    private Double getMeetUpWeather(LocalDate meetUp) {
        WeatherResponse weatherResponse = getWeather();
        Double meetUpWeather = null;
        for (Weather weather : weatherResponse.getList()) {
            if (meetUp.compareTo(weather.getDate()) == 0) {
                meetUpWeather = (double) weather.getTemp().getMax();
            }

        }
        return meetUpWeather;

    }

    public WeatherResponse getWeather() {
        return apiWeatherService.getWeather();
    }
}
