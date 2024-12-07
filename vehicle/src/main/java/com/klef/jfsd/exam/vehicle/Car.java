package com.klef.jfsd.exam.vehicle;

	import javax.persistence.Entity;

	@Entity
	public class Car extends Vehicle {

	    private int numberOfDoors;

	    // Getter and setter
	    public int getNumberOfDoors() {
	        return numberOfDoors;
	    }
	    public void setNumberOfDoors(int numberOfDoors) {
	        this.numberOfDoors = numberOfDoors;
	    }
	}
