package com.parking.smartparkinglot.entity;

import com.parking.smartparkinglot.enums.GateType;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.UUID;

@Getter
@Entity
public class Gate {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;

    @Enumerated(EnumType.STRING)
    private GateType gateType;

    @ManyToOne
    private ParkingFloor parkingFloor;
}
