package com.example.entity.location;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "country")
public class Country {

    private Long id;
    private String name;
    private List<State> states;

    @Id
    @GeneratedValue
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

    @OneToMany(mappedBy = "country")
    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }

}
