package com.ideas.miproyecto.springboot.app.meetups.controller;

import com.ideas.miproyecto.springboot.app.meetups.request.MeetUpRequest;
import com.ideas.miproyecto.springboot.app.meetups.response.BeerMeetUpResponse;
import com.ideas.miproyecto.springboot.app.meetups.response.MeetUpWeatherResponse;
import com.ideas.miproyecto.springboot.app.meetups.service.MeetUpServiceHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MeetUpController {

    @Autowired
    private MeetUpServiceHandler meetUpServiceHandler;

    //Endpoinds naming: sustantivos en plural, En general, los URI deben nombrarse con sustantivos que especifiquen el contenido del recurso.
    //Ejemplo naming: /meetups no /meetup CORREGIR
    //Uso de naming intuitivo en cuanto mas claro y limpio mejor Ejemplo naming: /meetups no /meet_up es mas claro sin el guion bajo
    //Si hay que separar palabras usar -guion medio
    //Minuscula
    //Sin caracteres especiales o extensiones como .xml .
    @RequestMapping(value = "/meetup", method = RequestMethod.POST)
    public ResponseEntity<?> createMeetUp(@RequestBody MeetUpRequest meetUpRequest) {
        return meetUpServiceHandler.createMeetUp(meetUpRequest);
    }
    //Endpoinds naming: sustantivos en plural, En general, los URI deben nombrarse con sustantivos que especifiquen el contenido del recurso.
    //Ejemplo naming:/weathers/{meetUpId} y no /weather/{meetUpId} CORREGIR
    @RequestMapping(value = "/weather/{meetUpId}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(code = HttpStatus.OK)
    public ResponseEntity<?> getMeetUpWeather(@PathVariable("meetUpId") Long meetUpId) throws Exception {

        MeetUpWeatherResponse meetUpWeatherResponse = meetUpServiceHandler.getMeetUpWeather(meetUpId);
        return new ResponseEntity<>(meetUpWeatherResponse, HttpStatus.OK);

    }
    //Endpoinds naming: sustantivos en plural, En general, los URI deben nombrarse con sustantivos que especifiquen el contenido del recurso.
    //Ejemplo naming:/beers/{meetUpId} y no /beer/{meetUpId} CORREGIR
    //Sin caracteres especiales EJEMPLO /beers/{meetUpId} y no /beer:p/{meetUpId}
    @RequestMapping(value = "/beer:p/{meetUpId}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(code = HttpStatus.OK)
    public ResponseEntity<?> getBeerMeetUp(@PathVariable("meetUpId") Long meetUpId) throws Exception {
        BeerMeetUpResponse beerMeetUpResponse = meetUpServiceHandler.getBeerMeetUp(meetUpId);
        return new ResponseEntity<>(beerMeetUpResponse, HttpStatus.OK);
    }


}
