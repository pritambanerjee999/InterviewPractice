package com.design.car.park;

public abstract class ParkingSpot {
	
	
	private Integer id;
	private String type; //compact or sedan or full size suv
	private boolean isFree;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isFree() {
		return isFree;
	}
	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}

}
