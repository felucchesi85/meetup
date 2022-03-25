package com.ideas.miproyecto.springboot.app.meetups.model.entity;

import java.util.List;

public class MeetUpList {

    private List<MeetUp> meetUps;

    public List<MeetUp> getMeetUps() {
        return meetUps;
    }

    public void setMeetUps(List<MeetUp> meetUps) {
        this.meetUps = meetUps;
    }
}
