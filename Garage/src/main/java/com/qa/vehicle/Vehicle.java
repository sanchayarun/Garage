package com.qa.vehicle;

public abstract class Vehicle {
	
	// Variables
		
		private boolean diesel;
		private int year;
		private int wheels;

		// Default Constructor

		public Vehicle() {

		}

		// Everything Constructor

		public Vehicle(boolean diesel, int year, int wheels) {
			this.diesel = diesel;
			this.year = year;
			this.wheels = wheels;
		}

		// Getter and Setter

		public boolean getDiesel() {
			return diesel;
		}

		public void setfuelType(boolean diesel) {
			this.diesel = diesel;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public int getWheels() {
			return wheels;
		}

		public void setWheels(int wheels) {
			this.wheels = wheels;
		}

		// toString() Method for Person

		@Override
		public String toString() {
			return "\n Fuel type is Diesel = " + diesel + ", \n Year of Manufacture = " + year + ",\n Number of Wheels = " + wheels;
		}

}
