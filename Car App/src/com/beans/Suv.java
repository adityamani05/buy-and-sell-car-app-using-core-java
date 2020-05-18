package com.beans;

public class Suv extends Car{
	private float gst=5;

	public Suv(String carName, String carModel, float carPrice, float carMlg, String carColor,
			String CarCompanyName,String carType) {
		super(carName, carModel, carPrice, carMlg, carColor, CarCompanyName,carType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setCarPrice(float carprice) {
		// TODO Auto-generated method stub
		this.carPrice=carprice+carprice*gst/100;
		
	}

	@Override
	public void getSeats() {
		// TODO Auto-generated method stub
		System.out.println("5 seater");
		
	}


}