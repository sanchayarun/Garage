package com.qa.garage;

import java.util.ArrayList;

import java.util.List;

import com.qa.vehicle.*;

public class Garage extends Vehicle {

	// List Variable

	public List<Vehicle> garage = new ArrayList<>();

	// Default Constructor

	public Garage() {
	}

	// Everything Constructor

	public Garage(List<Vehicle> vehicles) {
		super();
		this.garage = vehicles;
	}

	// Add Vehicle Method

	public void addVehicle(Vehicle vehicle) {
		this.garage.add(vehicle);
	}

	// Remove Vehicle Method

	public void removeVehicle(Vehicle vehicle) {
		this.garage.remove(vehicle);
	}

	// Print all vehicles

	public void printGarage() {
		for (Vehicle i : garage)
			System.out.println(i);
	}

	// Remove Cars

	public void removeCars() {

		for (Vehicle i : garage) {
			if (i instanceof Car) {
				removeVehicle(i);

			}
		}
	}

	// Remove Bus

	public void removeBus() {

		for (Vehicle i : garage) {
			if (i instanceof Bus) {
				removeVehicle(i);

			}
		}
	}

	// Remove Motorbike

	public void removeMotorbike() {

		for (Vehicle i : garage) {
			if (i instanceof Motorbike) {
				removeVehicle(i);

			}
		}
	}

	// Remove by Type

	public void removeType(String vehicleType) {
		
		for (Vehicle i : garage) {
			if (i.getClass().getSimpleName().equals(vehicleType)) {
				if (vehicleType.equalsIgnoreCase("cars")) {
					//garage.removeCar();
				}
			}
		}

//		if ("Car".equalsIgnoreCase(vehicleType)) {
//			removeCars();
//		} else if ("Bus".equalsIgnoreCase(vehicleType)) {
//			removeBus();
//		} else if ("Motorbike".equalsIgnoreCase(vehicleType)) {
//			removeMotorbike();
//		}

	}

	// Remove All Vehicles Method

	public void removeAllVehicles() {
		this.garage.clear();
	}

	// Bill Calculator Method

	public String calculateBill(Vehicle vehicle) {
		double bill = 0;

		for (Vehicle v : garage) {

			if (v.equals(vehicle)) {

				if (v.getDiesel()) {
					bill = bill + 100;
				}
				if (v.getYear() > 2018) {
					bill = bill + 500;
				}
				if (v.getWheels() > 2) {
					bill = bill + 220;
				}
				if (v instanceof Car) {
					bill = bill * 1.5;
				} else if (v instanceof Bus) {
					bill = (bill + 200) * 2;
				} else if (v instanceof Motorbike) {
					bill = (bill / 2) * 1.5;
				}
			}
		}
		return "Your total is " + bill + ".";

	}

}
