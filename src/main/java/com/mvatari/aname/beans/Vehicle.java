package com.mvatari.aname.beans;

import java.util.List;

public abstract class Vehicle {
	private long ID;
	private String name;
	private int lineNumber;
	private List<VehicleStop> vehicleStops;
	
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	public List<VehicleStop> getVehicleStops() {
		return vehicleStops;
	}
	public void setVehicleStops(List<VehicleStop> vehicleStops) {
		this.vehicleStops = vehicleStops;
	}
	
	
}
