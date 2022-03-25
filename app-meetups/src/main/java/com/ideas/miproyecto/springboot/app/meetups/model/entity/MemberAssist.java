package com.ideas.miproyecto.springboot.app.meetups.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "member_assist")
public class MemberAssist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    boolean assist;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "meet_ups_id")
    private MeetUp meetUp;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "members_id")
    private Member member;
    private static final long serialVersionUID = 1L;

    public MemberAssist() {
    }

    public MemberAssist(MeetUp meetUp, Member member, boolean assist) {
        this.member = member;
        this.meetUp = meetUp;
        this.assist = assist;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isAssist() {
        return assist;
    }

    public void setAssist(boolean assist) {
        this.assist = assist;
    }

    public MeetUp getMeetUp() {
        return meetUp;
    }

    public void setMeetUp(MeetUp meetUp) {
        this.meetUp = meetUp;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
