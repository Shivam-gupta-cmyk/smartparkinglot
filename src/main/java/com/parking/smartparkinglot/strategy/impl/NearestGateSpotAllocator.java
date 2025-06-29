package com.parking.smartparkinglot.strategy.impl;

import com.parking.smartparkinglot.entity.ParkingSpot;
import com.parking.smartparkinglot.entity.Vehicle;
import com.parking.smartparkinglot.enums.SpotType;
import com.parking.smartparkinglot.enums.VehicleType;
import com.parking.smartparkinglot.strategy.SpotAllocationStrategy;

import java.util.Comparator;
import java.util.List;

public class NearestGateSpotAllocator implements SpotAllocationStrategy {

    @Override
    public ParkingSpot allocateParkingSpot(Vehicle vehicle, List<ParkingSpot> availableParkingSpots) {
        return availableParkingSpots.stream()
                .filter(spot -> isCompatible(vehicle.getVehicleType(), spot.getSpotType()))
                .min(Comparator.comparingInt(spot -> spot.getFloor().getFloorNumber()))
                .orElse(null);
    }

    private boolean isCompatible(VehicleType vehicleType, SpotType spotType){
        return switch (vehicleType) {
            case MOTORCYCLE -> true;
            case CAR -> spotType != SpotType.SMALL;
            case BUS -> spotType == SpotType.LARGE;
        };
    }
}
