package com.example.entity.aircraft;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "manufacturer")
public class Manufacturer {

    private Long id;
    private String name;
    private List<AirplaneModel> models;

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

    @OneToMany(mappedBy = "manufacturer")
    public List<AirplaneModel> getModels() {
        return models;
    }

    public void setModels(List<AirplaneModel> models) {
        this.models = models;
    }
}
