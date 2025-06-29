package com.parking.smartparkinglot.entity;

import com.parking.smartparkinglot.enums.VehicleType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String licensePlate;

    @Enumerated(EnumType.STRING)
    @Setter
    private VehicleType vehicleType;


}
