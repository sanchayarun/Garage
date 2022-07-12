package com.qa.garagetest;

import com.qa.garage.Garage;
import com.qa.vehicle.Bus;
import com.qa.vehicle.Car;
import com.qa.vehicle.Motorbike;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class GarageTest {
	
//
//		// Creates a new ArrayList named vehicles
//
		Garage vehicles = new Garage();
//
//		// Creates new objects
//
		Car carOne = new Car(true, 2020, 4, "Hatchback", "Manual");

		Motorbike bikeOne = new Motorbike(false, 2018, 2, 300, "Urban" ); 
	
		Bus busOne = new Bus(true, 2002, 4, 90, 5);
		


	
		@Test
		public void checkcalculateBill() {
			vehicles.addVehicle(carOne);
			assertEquals("Your total is 1230.0.", vehicles.calculateBill(carOne));
		}
		
		@Test
		public void checkcalgetDiesel() {
			vehicles.addVehicle(busOne);
			assertEquals( true, busOne.getDiesel());
		}
		
		@Test
		public void checkcalgetYear() {
			vehicles.addVehicle(bikeOne);
			assertEquals( 2018, bikeOne.getYear());
		}

}
