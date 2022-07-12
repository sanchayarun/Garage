package com.qa.vehicle;

/**
 * @author Sanchayan Arudchelvam
 */

public abstract class Vehicle {

	// Variables

	private boolean diesel;
	private int year;
	private int wheels;

	/**
	 * Default Constructor
	 */

	public Vehicle() {

	}

	/**
	 * Everything Constructor 
	 */

	public Vehicle(boolean diesel, int year, int wheels) {
		this.diesel = diesel;
		this.year = year;
		this.wheels = wheels;
	}


	/**
	 * Gets the value stored in diesel variable for the specified Vehicle object
	 * @return 
	 * diesel boolean value for specified object
	 */
	
	public boolean getDiesel() {
		return diesel;
	}

	/**
	 * Sets a new value for diesel variable within specified Vehicle object
	 * @return 
	 * diesel boolean value for specified object is updated
	 */
	
	public void setfuelType(boolean diesel) {
		this.diesel = diesel;
	}

	/**
	 * Gets the value stored in year variable for the specified Vehicle object
	 * @return 
	 * year int value for specified object
	 */
	
	public int getYear() {
		return year;
	}

	/**
	 * Sets a new value for year variable within specified Vehicle object
	 * @return 
	 * year int value for specified object is updated
	 */
	
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * Gets the value stored in wheels variable for the specified Vehicle object
	 * @return 
	 * wheels int value for specified object
	 */
	
	public int getWheels() {
		return wheels;
	}

	/**
	 * Sets a new value for wheels variable within specified Vehicle object
	 * @return 
	 * wheels int value for specified object is updated
	 */
	
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	/**
	 * An override of the toString() Method for Vehicle Class
	 * @return 
	 * A string of all the declared variables for the class Vehicle
	 */

	@Override
	public String toString() {
		return "\n Fuel type is Diesel = " + diesel + ", \n Year of Manufacture = " + year + ",\n Number of Wheels = "
				+ wheels;
	}

}
