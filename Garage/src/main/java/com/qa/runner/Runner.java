package com.qa.runner;


import com.qa.garage.Garage;
import com.qa.vehicle.*;


public class Runner {

	public static void main(String[] args) {

		// Creates a new ArrayList named vehicles

		Garage garage = new Garage();

		// Creates new objects

		Car carOne = new Car(true, 2020, 4, "Hatchback", "Manual");
		Car carTwo = new Car(false, 2020, 4, "Hatchback", "Manual");
		Motorbike bikeOne = new Motorbike(false, 2018, 2, 300, "Urban" ); 
		Motorbike bikeTwo = new Motorbike(false, 2022, 2, 300, "Off-Road"); 
		Bus busOne = new Bus(true, 2002, 4, 90, 5);
		Bus busTwo = new Bus(true, 2021, 4, 60, 5);

		// Adds the newly created vehicle objects to the vehicles list

		garage.addVehicle(carOne);
		garage.addVehicle(carTwo);
		garage.addVehicle(busOne);
		garage.addVehicle(busTwo);
		garage.addVehicle(bikeOne);
		garage.addVehicle(bikeTwo);
		
		// Print out of object variables in String format
		
		System.out.println(carOne.toString());
		System.out.println(busOne.toString());
		System.out.println(bikeOne.toString());
		
		// Calculate the bill
		
		System.out.println(garage.calculateBill(carOne));
		System.out.println(garage.calculateBill(carTwo));
		
		System.out.println(carOne.getDiesel());
		
		garage.printGarage();
		
	///	garage.removeType(bus);
		
		System.out.println("=======================");
		
		garage.printGarage();
	}
}
