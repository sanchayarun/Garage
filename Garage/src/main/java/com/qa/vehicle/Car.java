package com.qa.vehicle;

public class Car extends Vehicle{
	
	// Variables 
	
	private String bodyType;
	private String transmission;
	
	
	// Default Constructor
	
	public Car() {
		
	}
	
	
	// Everything Constructor
	
	public Car(boolean diesel, int year, int wheels, String bodyType, String transmission) {
		super(diesel, year, wheels);
		this.bodyType = bodyType;
		this.transmission = transmission;
	}

	
	// Getters and Setter
	
	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	
	// toString()
	
	@Override
	public String toString() {
		return "\n Fuel type is Diesel = " + getDiesel() + ", \n Year of Manufacture = " + getYear() + 
		",\n Number of Wheels = " + getWheels() + ", \n Body Type = " + bodyType + ", \n Transmission = " + transmission ;
	}
	
	

	
	
	
	
}
