package com.parking.smartparkinglot.entity;

import com.parking.smartparkinglot.enums.GateType;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;
import java.util.UUID;

@Getter
@Entity
public class ParkingFloor {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private int floorNumber;

    @OneToMany(mappedBy = "floor")
    private List<ParkingSpot> parkingSpotList;

}
