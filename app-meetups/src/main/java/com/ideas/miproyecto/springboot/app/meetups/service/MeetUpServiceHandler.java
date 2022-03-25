package com.ideas.miproyecto.springboot.app.meetups.service;

import com.ideas.miproyecto.springboot.app.meetups.model.entity.MeetUpList;
import com.ideas.miproyecto.springboot.app.meetups.request.MeetUpRequest;
import com.ideas.miproyecto.springboot.app.meetups.response.BeerMeetUpResponse;
import com.ideas.miproyecto.springboot.app.meetups.response.MeetUpWeatherResponse;
import org.springframework.http.ResponseEntity;

public interface MeetUpServiceHandler {

    ResponseEntity createMeetUp(MeetUpRequest meetUpRequest);

    MeetUpList getMeetUps();

    MeetUpWeatherResponse getMeetUpWeather(Long meetUpId) throws Exception;

    BeerMeetUpResponse getBeerMeetUp(Long meetUpId) throws Exception;


}
