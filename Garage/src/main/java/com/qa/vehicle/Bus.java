package com.qa.vehicle;

public class Bus extends Vehicle {
	
	
	// Variables
	
	private int maxPassengers;
	private int gears;
	
	
	// Default Constructor
	
	public Bus() {
	}


	// Everything Constructor
	
	public Bus(boolean diesel, int year, int wheels, int maxPassengers, int gears) {
		super(diesel, year, wheels);
		this.maxPassengers = maxPassengers;
		this.gears = gears;
	}

	
	// Getters and Setters
	
	public int getMaxPassengers() {
		return maxPassengers;
	}


	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}


	public int getGears() {
		return gears;
	}


	public void setGears(int gears) {
		this.gears = gears;
	}
	
	
	// toString()
	
		@Override
		public String toString() {
			return "\n Fuel type is Diesel = " + getDiesel() + ", \n Year of Manufacture = " + getYear() + 
			",\n Number of Wheels = " + getWheels() + ", \n Max Passengers = " + maxPassengers + 
			", \n Number of Gears = " + gears ;
		}
	
	
	

}
