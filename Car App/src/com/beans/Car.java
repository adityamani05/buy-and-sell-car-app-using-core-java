package com.beans;

abstract public class Car 
{
	protected int carId;
	protected String carName;
	protected String carModel;
	protected float carPrice;
	protected float carMlg;
	protected String carColor;
	protected String carCompanyName;
	protected String carType;
	private static int i ;
	
	static
	{
		i=100;
	}
	
	
	public Car(String carName,String carModel,float carPrice,float carMlg,String carColor,String carType,String carCompanyName) 
	{
		i++;
		this.carId=i;
		this.carName=carName;
		this.carModel=carModel;;
		this.carPrice=carPrice;
		this.carMlg=carMlg;
		this.carColor=carColor;
		this.carCompanyName=carCompanyName;
		this.carType=carType;
		
	}
	
	//setter-methods
	public abstract void setCarPrice(float carprice);
	public abstract void getSeats();
		
	//getter-methods
	public int getCarId()
	{
		return  this.carId;
	}
	public String getCarName()
	{
		return  this.carName;
	}
	public String getCarModel() 
	{
		return this.carModel;
	}
	public float getCarMlg() 
	{
		return this.carMlg;
	}
	public String getCarColor() 
	{
		return this.carColor;
	}
	public float getCarPrice()
	{
		return this.carPrice;
	}
	
	public String toString() {
		return "Car Id:"+this.carId+"Car Name:"+this.carName+"Car Model:"+this.carModel+"Car Price:"+this.carPrice+"Car Milege:"+this.carMlg+"Car Color:"+this.carColor+"Car company:"+this.carCompanyName;
	}
	
	
	
}
