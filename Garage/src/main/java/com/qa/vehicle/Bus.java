package com.qa.vehicle;

/**
 * @author
 * Sanchayan Arudchelvam
 */

public class Bus extends Vehicle {
	
	
	// Variables
	
	private int maxPassengers;
	private int gears;
	
	/**
	 * Default Constructor
	 */
	
	public Bus() {
	}

	/**
	 * Everything Constructor
	 */
	
	public Bus(boolean diesel, int year, int wheels, int maxPassengers, int gears) {
		super(diesel, year, wheels);
		this.maxPassengers = maxPassengers;
		this.gears = gears;
	}

	
	/**
	 * Gets the value stored in maxPassengers variable for the specified Bus object
	 * @return 
	 * maxPassengers int value for specified Bus object
	 */
	
	public int getMaxPassengers() {
		return maxPassengers;
	}

	/**
	 * Sets a new value for maxPassengers variable within the specified Bus object
	 * @return 
	 * maxPassengers int value for specified object is updated
	 */
	

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

	/**
	 * Gets the value stored in gears variable for the specified Bus object
	 * @return 
	 * gears int value for specified Bus object
	 */
	
	public int getGears() {
		return gears;
	}

	/**
	 * Sets a new value for gears variable within the specified Bus object
	 * @return 
	 * gears int value for specified object is updated
	 */
	
	public void setGears(int gears) {
		this.gears = gears;
	}
	
	/**
	 * An override of the toString() Method for Bus Class
	 * @return 
	 * A string of all the declared variables for the class Bus and the extended variables from Vehicle Class
	 */
	
		@Override
		public String toString() {
			return "\n Fuel type is Diesel = " + getDiesel() + ", \n Year of Manufacture = " + getYear() + 
			",\n Number of Wheels = " + getWheels() + ", \n Max Passengers = " + maxPassengers + 
			", \n Number of Gears = " + gears ;
		}
	
	
	

}
