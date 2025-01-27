package com.f5.toll_system.vehicle;

public abstract class Vehicle {
    protected String plate;

    public Vehicle(String plate) {
        this.plate = plate;
    }

    public String getPlate() {
        return plate;
    }

    public abstract double calculateToll();
}
