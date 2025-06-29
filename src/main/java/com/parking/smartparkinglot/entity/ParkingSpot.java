package com.parking.smartparkinglot.entity;

import com.parking.smartparkinglot.enums.SpotType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Entity
public class ParkingSpot {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Enumerated(EnumType.STRING)
    @Setter
    private SpotType spotType;

    @Setter
    private boolean isOccupied;
    @ManyToOne
    private ParkingFloor floor;

}
