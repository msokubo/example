package com.example.entity.aircraft;

import javax.persistence.*;

@Entity
@Table(name = "airplane")
public class Airplane {

    private Long id;
    private AirplaneModel model;
    private String serialNumber;
    private Long firstClassCapacity;
    private Long executiveClassCapatiy;
    private Long economyClassCapacity;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "model_id")
    public AirplaneModel getModel() {
        return this.model;
    }

    public void setModel(AirplaneModel model) {
        this.model = model;
    }

    @Column(name = "serial_number")
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Column(name = "first_class_cap")
    public Long getFirstClassCapacity() {
        return firstClassCapacity;
    }

    public void setFirstClassCapacity(Long firstClassCapacity) {
        this.firstClassCapacity = firstClassCapacity;
    }

    @Column(name = "executive_class_cap")
    public Long getExecutiveClassCapatiy() {
        return executiveClassCapatiy;
    }

    public void setExecutiveClassCapatiy(Long executiveClassCapatiy) {
        this.executiveClassCapatiy = executiveClassCapatiy;
    }

    @Column(name = "economy_class_cap")
    public Long getEconomyClassCapacity() {
        return economyClassCapacity;
    }

    public void setEconomyClassCapacity(Long economyClassCapacity) {
        this.economyClassCapacity = economyClassCapacity;
    }

}
