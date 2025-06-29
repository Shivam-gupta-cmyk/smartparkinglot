package com.parking.smartparkinglot.repository;

import com.parking.smartparkinglot.entity.ParkingFloor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParkingFloorRepository extends JpaRepository<ParkingFloor,UUID>{

}
