package com.ideas.miproyecto.springboot.app.meetups.model.repository;

import com.ideas.miproyecto.springboot.app.meetups.model.entity.MemberAssist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberAssistRepository extends CrudRepository<MemberAssist, Long> {

    List<MemberAssist> findAll();
}
