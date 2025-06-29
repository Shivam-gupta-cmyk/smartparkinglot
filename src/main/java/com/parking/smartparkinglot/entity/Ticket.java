package com.parking.smartparkinglot.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    private Vehicle vehicle;
    @ManyToOne
    private ParkingSpot parkingSpot;
    private LocalDateTime entryTime;

    @ManyToOne
    private Gate entryGate;

}
