package com.qa.vehicle;

public class Motorbike extends Vehicle {

	
	// Variables
	
	private int engineSize;
	private String terrain;

	
	// Default Constructor
	
	public Motorbike() {
	}

	
	// Everything Constructor
	
	public Motorbike(boolean diesel, int year, int wheels, int engineSize, String terrain) {
		super(diesel, year, wheels);
		this.engineSize = engineSize;
		this.terrain = terrain;
	}

	
	// Getters and Setters
	
	public int getEngineSize() {
		return engineSize;
	}


	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}


	public String getTerrain() {
		return terrain;
	}


	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}
	
	
	// toString()
	
	@Override
	public String toString() {
		return "\n Fuel type is Diesel = " + getDiesel() + ", \n Year of Manufacture = " + getYear() + 
		",\n Number of Wheels = " + getWheels() + ", \n Engine Size = " + engineSize + 
		", \n Terrain = " + terrain ;
	}
	
	
	
	
}
