package com.example.entity.location;

import javax.persistence.*;

@Entity
@Table(name = "city")
public class City {

    private Long id;
    private String name;
    private State state;


    @GeneratedValue
    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne
    @JoinColumn(name = "state_id")
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
