package com.f5.toll_system.tollStation;

import com.f5.toll_system.vehicle.Vehicle;
import com.f5.toll_system.vehicle.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TollBoothService {
    @Autowired
    private TollBoothRepository tollBoothRepository;
    @Autowired
    private VehicleRepository vehicleRepository;

    public TollStation createTollBooth(TollStation tollBooth) {
        return tollBoothRepository.save(tollBooth);
    }

    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    // Otros métodos para buscar, actualizar y eliminar entidades
}