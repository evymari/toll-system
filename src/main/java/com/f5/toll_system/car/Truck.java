package com.f5.toll_system.car;

import com.f5.toll_system.vehicle.Vehicle;

public class Truck extends Vehicle {
    private int axes;

    public Truck(String plate, int axes) {
        super(plate);
        this.axes = axes;
    }

    @Override
    public double calculateToll() {
        return 50.0 * axes; // $50 per axis
    }

    public int getAxes() {
        return axes;
    }
}
