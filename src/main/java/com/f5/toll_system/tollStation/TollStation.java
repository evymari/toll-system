package com.f5.toll_system.tollStation;
import com.f5.toll_system.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class TollStation {
    private String name;
    private String city;
    private double totalCollected;
    private List<Vehicle> vehicles;

    public TollStation(String name, String city) {
        this.name = name;
        this.city = city;
        this.totalCollected = 0;
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
        this.totalCollected += vehicle.calculateToll();
    }

    public void printReport() {
        System.out.println("Toll Station: " + name + " in " + city);
        System.out.println("Total collected: $" + totalCollected);
        System.out.println("Vehicles that passed:");

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getPlate() + " - Toll: $" + vehicle.calculateToll());
        }
    }

    public double getTotalCollected() {
        return totalCollected;
    }
}
