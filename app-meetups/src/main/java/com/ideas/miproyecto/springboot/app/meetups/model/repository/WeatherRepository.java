package com.ideas.miproyecto.springboot.app.meetups.model.repository;

import com.ideas.miproyecto.springboot.app.meetups.model.entity.MeetUp;
import com.ideas.miproyecto.springboot.app.meetups.model.entity.Weather;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WeatherRepository extends CrudRepository<Weather, Long> {

    List<Weather> findAll();
}
