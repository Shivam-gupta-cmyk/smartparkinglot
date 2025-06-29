package com.parking.smartparkinglot.repository;

import com.parking.smartparkinglot.entity.ParkingSpot;
import com.parking.smartparkinglot.enums.SpotType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpot, UUID> {
    List<ParkingSpot> findBySpotTypeAndIsOccupiedFalse(SpotType type);
}
