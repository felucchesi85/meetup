package com.ideas.miproyecto.springboot.app.meetups.model.repository;

import com.ideas.miproyecto.springboot.app.meetups.model.entity.MeetUp;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MeetUpRepository extends CrudRepository<MeetUp, Long> {

    List<MeetUp> findAll();
}
