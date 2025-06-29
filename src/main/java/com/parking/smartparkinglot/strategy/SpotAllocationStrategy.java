package com.parking.smartparkinglot.strategy;

import com.parking.smartparkinglot.entity.ParkingSpot;
import com.parking.smartparkinglot.entity.Vehicle;

import java.util.List;

public interface SpotAllocationStrategy {
    ParkingSpot allocateParkingSpot(Vehicle vehicle, List<ParkingSpot> availableParkingSpotList);
}
