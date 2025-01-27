package com.f5.toll_system.vehicle;

import com.f5.toll_system.tollStation.TollStation;

import java.util.List;

public interface VehicleRepository {
    List<Vehicle> findByTollBooth(TollStation tollBooth);

    Vehicle save(Vehicle vehicle);
}
