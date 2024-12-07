package com.klef.jfsd.exam.vehicle;

	import javax.persistence.Entity;

	@Entity
	public class Truck extends Vehicle {

	    private int loadCapacity;

	    // Getter and setter
	    public int getLoadCapacity() {
	        return loadCapacity;
	    }
	    public void setLoadCapacity(int loadCapacity) {
	        this.loadCapacity = loadCapacity;
	    }
	}
