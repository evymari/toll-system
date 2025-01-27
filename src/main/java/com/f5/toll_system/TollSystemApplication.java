package com.f5.toll_system;

import com.f5.toll_system.car.Car;
import com.f5.toll_system.car.Motorcycle;
import com.f5.toll_system.car.Truck;
import com.f5.toll_system.tollStation.TollStation;
import com.f5.toll_system.vehicle.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TollSystemApplication {

	public static void main(String[] args) {
		TollStation tollStation = new TollStation("Main Toll", "New York");

		Vehicle car = new Car("ABC123");
		Vehicle motorcycle = new Motorcycle("XYZ789");
		Vehicle truck = new Truck("TRK456", 3);

		tollStation.addVehicle(car);
		tollStation.addVehicle(motorcycle);
		tollStation.addVehicle(truck);

		tollStation.printReport();
	}
}