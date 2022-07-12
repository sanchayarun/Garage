package com.qa.runner;


import com.qa.garage.Garage;
import com.qa.vehicle.*;


public class Runner {

	public static void main(String[] args) {

		// Creates a new ArrayList named vehicles

		Garage vehicles = new Garage();

		// Creates new objects

		Car carOne = new Car(true, 2020, 4, "Hatchback", "Manual");
		Car carTwo = new Car(false, 2020, 4, "Hatchback", "Manual");
		Motorbike bikeOne = new Motorbike(false, 2018, 2, 300, "Urban" ); 
		Motorbike bikeTwo = new Motorbike(false, 2022, 2, 300, "Off-Road"); 
		Bus busOne = new Bus(true, 2002, 4, 90, 5);
		Bus busTwo = new Bus(true, 2021, 4, 60, 5);

		// Adds the newly created vehicle objects to the vehicles list

		vehicles.addVehicle(carOne);
		vehicles.addVehicle(carTwo);
		vehicles.addVehicle(busOne);
		vehicles.addVehicle(busTwo);
		vehicles.addVehicle(bikeOne);
		vehicles.addVehicle(bikeTwo);
		
		// Print out of object variables in String format
		
		System.out.println(carOne.toString());
		System.out.println(busOne.toString());
		System.out.println(bikeOne.toString());
		
		// Calculate the bill
		
		System.out.println(vehicles.calculateBill(carOne));
		System.out.println(vehicles.calculateBill(carTwo));
		
		System.out.println(carOne.getDiesel());
	}
}
