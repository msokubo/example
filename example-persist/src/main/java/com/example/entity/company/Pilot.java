package com.example.entity.company;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "pilot")
public class Pilot extends Employee {

}
