package com.f5.toll_system.car;

import com.f5.toll_system.vehicle.Vehicle;

public class Car extends Vehicle {

    public Car(String plate) {
        super(plate);
    }

    @Override
    public double calculateToll() {
        return 100.0; // Flat rate for cars
    }
}

