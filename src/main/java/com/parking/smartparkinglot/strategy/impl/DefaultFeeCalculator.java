package com.parking.smartparkinglot.strategy.impl;

import com.parking.smartparkinglot.entity.Vehicle;
import com.parking.smartparkinglot.strategy.FeeCalculationStrategy;

import java.time.Duration;

public class DefaultFeeCalculator implements FeeCalculationStrategy {

    @Override
    public double calculateFees(Vehicle vehicle, Duration duration) {
        long hours = duration.toHours() + 1;
        double rate = switch (vehicle.getVehicleType()) {
            case MOTORCYCLE -> 10;
            case CAR -> 20;
            case BUS -> 30;
        };
        return hours * rate;
    }
}
