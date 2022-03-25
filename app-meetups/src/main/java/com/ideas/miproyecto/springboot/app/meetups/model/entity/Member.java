package com.ideas.miproyecto.springboot.app.meetups.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "members")
public class Member implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String name;
    private String pwd;
    private String username;
    @NotEmpty
    @Column(name = "last_name")
    private String lastName;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "member")
    @Column(name = "member_assist")
    private Set<MemberAssist> memberAssists;
    private static final long serialVersionUID = 1L;

    public Member() {
    }

    public Member(@NotEmpty String name, @NotEmpty String lastName, Set<MemberAssist> memberAssists, String pwd, String username) {
        this.name = name;
        this.lastName = lastName;
        this.memberAssists = memberAssists;
        this.pwd = pwd;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<MemberAssist> getMemberAssists() {
        return memberAssists;
    }

    public void setMemberAssists(Set<MemberAssist> memberAssists) {
        this.memberAssists = memberAssists;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setToken(String token) {
    }

    public void setUser(String username) {
    }
}
