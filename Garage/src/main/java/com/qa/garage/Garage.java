package com.qa.garage;

import java.util.ArrayList;

import java.util.List;

import com.qa.vehicle.*;

public class Garage extends Vehicle{
	
	
	// List Variable
	
	public List<Vehicle> vehicles = new ArrayList<>();
	
	
	// Default Constructor
	
	public Garage() {	
	}
	
	
	// Everything Constructor
	
	public Garage(List<Vehicle> vehicles) {
		super();
		this.vehicles = vehicles;
	}
	
	
	// Add Vehicle Method

	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}

	
	// Remove Vehicle Method
	
	public void removeVehicle(Vehicle vehicle) {
		this.vehicles.remove(vehicle);
	}
	
	
	// Remove Cars

	public void removeCars() {

		for (Vehicle i : vehicles) {
			if (i instanceof Car) {
				removeVehicle(i);

			}
		}
	}
	
	
	// Remove Bus

	public void removeBus() {

		for (Vehicle i : vehicles) {
			if (i instanceof Bus) {
				removeVehicle(i);

			}
		}
	}
	
	
	// Remove Motorbike

	public void removeMotorbike() {

		for (Vehicle i : vehicles) {
			if (i instanceof Bus) {
				removeVehicle(i);

			}
		}
	}
	
	
	// Remove by Type

	public void removeType(String vehicleType) {

		if ("Car".equalsIgnoreCase(vehicleType)) {
			removeCars();
		} else if ("Bus".equalsIgnoreCase(vehicleType)) {
			removeBus();
		} else if ("Motorbike".equalsIgnoreCase(vehicleType)) {
			removeMotorbike();
		}

	}
	
	
	// Remove All Vehicles Method
	
		public void removeAllVehicles() {
			this.vehicles.clear();
		}
	
	
	// Bill Calculator Method
	
	public String calculateBill(Vehicle vehicle) {
		double bill = 0;
		
		for (Vehicle v : vehicles) {
		
			
			if (v.equals(vehicle)){
				
			
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
		

	
	

	
