package com.parking.smartparkinglot.strategy;

import com.parking.smartparkinglot.entity.Vehicle;

import java.time.Duration;

public interface FeeCalculationStrategy {
    double calculateFees(Vehicle vehicle, Duration duration);
}
