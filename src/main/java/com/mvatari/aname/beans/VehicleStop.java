package com.mvatari.aname.beans;

public abstract class VehicleStop {
	private long ID;
	private String name;
	private String address;
	private long latitude;
	private long longitude;
	
	
	
	public VehicleStop() {

	}

	public VehicleStop(long iD, String name, String address, long latitude,
			long longitude) {
		ID = iD;
		this.name = name;
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
	}

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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getLatitude() {
		return latitude;
	}
	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}
	public long getLongitude() {
		return longitude;
	}
	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}
	
	
}
