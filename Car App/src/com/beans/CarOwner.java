package com.beans;

public class CarOwner {
	private String carOwnerName;
	private String carOwnerNo;
	private int carId;
	public CarOwner(String carOwnerName, String carOwnerNo,int carId) {
		this.carOwnerName=carOwnerName;
		this.carOwnerNo=carOwnerNo;
		this.setCarId(carId);
	}
	public String getCarOwnerName() {
		return carOwnerName;
	}
	public void setCarOwnerName(String carOwnerName) {
		this.carOwnerName = carOwnerName;
	}
	public String getCarOwnerNo() {
		return carOwnerNo;
	}
	public void setCarOwnerNo(String carOwnerNo) {
		this.carOwnerNo = carOwnerNo;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	@Override
	public String toString() {
		return "CarOwner [carOwnerName=" + carOwnerName + ", carOwnerNo=" + carOwnerNo + ", carId=" + carId + "]";
	}
	
	
}
