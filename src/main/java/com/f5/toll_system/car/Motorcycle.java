package com.f5.toll_system.car;

import com.f5.toll_system.vehicle.Vehicle;

public class Motorcycle extends Vehicle {
    public Motorcycle(String plate) {
        super(plate);
    }

    @Override
    public double calculateToll() {
        return 50.0; // Flat rate for motorcycles
    }
}

