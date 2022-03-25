package com.ideas.miproyecto.springboot.app.meetups.model.entity;

import com.sun.istack.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "meet_ups")
public class MeetUp implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(name = "create_at")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    @NotEmpty
    private String address;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "meetUp")
    private Set<MemberAssist> memberAssists;

    private static final long serialVersionUID = 1L;

    public Set<MemberAssist> getMemberAssists() {
        return memberAssists;
    }

    public void setMemberAssists(Set<MemberAssist> memberAssists) {
        this.memberAssists = memberAssists;
    }

    public MeetUp(LocalDate date, String address) {
        this.date = date;
        this.address = address;
    }

    public MeetUp() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
