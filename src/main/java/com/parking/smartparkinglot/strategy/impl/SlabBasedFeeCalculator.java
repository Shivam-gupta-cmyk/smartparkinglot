package com.parking.smartparkinglot.strategy.impl;

import com.parking.smartparkinglot.entity.Vehicle;
import com.parking.smartparkinglot.enums.VehicleType;
import com.parking.smartparkinglot.strategy.FeeCalculationStrategy;

import java.time.Duration;

public class SlabBasedFeeCalculator implements FeeCalculationStrategy {

    @Override
    public double calculateFees(Vehicle vehicle, Duration duration) {
        long hours = duration.toHours() + 1;
        if (hours <= 1) return 20;
        else if (hours <= 3) return 20 + (hours - 1) * 15;
        else return 50 + (hours - 3) * 10;
    }

}
