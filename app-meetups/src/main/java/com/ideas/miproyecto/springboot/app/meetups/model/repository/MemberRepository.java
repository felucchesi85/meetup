package com.ideas.miproyecto.springboot.app.meetups.model.repository;

import com.ideas.miproyecto.springboot.app.meetups.model.entity.Member;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MemberRepository extends CrudRepository<Member, Long> {

    List<Member> findAll();

}
