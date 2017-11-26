package com.example.entity.flight;

import com.example.entity.Airport;
import com.example.entity.aircraft.Airplane;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.EnumType.STRING;

@Entity
@Table(name = "flight")
public class Flight {

    private Long id;
    private Long flightNumber;
    private Airplane airplane;
    private Date departure;
    private Date arrival;
    private Airport departureAirport;
    private Airport arrivalAirport;
    private FlightStatus status;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "flight_number")
    public Long getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(Long flightNumber) {
        this.flightNumber = flightNumber;
    }

    @ManyToOne
    @JoinColumn(name = "airplane_id")
    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    @ManyToOne
    @JoinColumn(name = "departure_airport_id")
    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }

    @ManyToOne
    @JoinColumn(name = "arrival_airport_id")
    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(Airport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    @Enumerated(STRING)
    public FlightStatus getStatus() {
        return status;
    }

    public void setStatus(FlightStatus status) {
        this.status = status;
    }
}
