package com.f5.toll_system.tollStation;

import com.f5.toll_system.car.Car;
import com.f5.toll_system.car.Motorcycle;
import com.f5.toll_system.car.Truck;
import com.f5.toll_system.vehicle.Vehicle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TollStationTest {

    @Test
    void testCarToll() {
        TollStation tollStation = new TollStation("Main Toll", "New York");
        Vehicle car = new Car("ABC123");
        tollStation.addVehicle(car);
        assertEquals(100.0, tollStation.getTotalCollected(), 0.01);
    }

    @Test
    void testMotorcycleToll() {
        TollStation tollStation = new TollStation("Main Toll", "New York");
        Vehicle motorcycle = new Motorcycle("XYZ789");
        tollStation.addVehicle(motorcycle);
        assertEquals(50.0, tollStation.getTotalCollected(), 0.01);
    }

    @Test
    void testTruckToll() {
        TollStation tollStation = new TollStation("Main Toll", "New York");
        Vehicle truck = new Truck("TRK456", 3);
        tollStation.addVehicle(truck);
        assertEquals(150.0, tollStation.getTotalCollected(), 0.01);
    }

    @Test
    void testReport() {
        TollStation tollStation = new TollStation("Main Toll", "New York");
        Vehicle car = new Car("ABC123");
        Vehicle motorcycle = new Motorcycle("XYZ789");
        tollStation.addVehicle(car);
        tollStation.addVehicle(motorcycle);

        tollStation.printReport();
    }
}
