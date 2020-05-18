package com.beans;
public class Client {
	private int clientId;
	private String clientName;
	private String carBookDate;
	private String carPurchaseDate;
	private int bookedCarId;
	private float bookingAmount;
	private int bookingId;
	private static int i;
	private static int j;
	static {
		i=1000;
		j=500;
	}

	//Constructor
	public Client(String clientName,String carBookDate,String carPurchaseDate,int bookedCarId,float bookingAmount) 
	{
		i++;
		j++;
		this.clientId=i;
		this.clientName=clientName;
		/*String[] values = carBookDate.split(",");
		int a =Integer.parseInt(values[0]);
		int b =Integer.parseInt(values[1]);
		int c =Integer.parseInt(values[2]);
		Date d1 = new Date(a,b,c);*/
		this.carBookDate=carBookDate;
		/*String[] value = carPurchaseDate.split(",");
		int x =Integer.parseInt(value[0]);
		int y =Integer.parseInt(value[1]);
		int z =Integer.parseInt(value[2]);
		Date d2 = new Date(x,y,z);*/
		this.carPurchaseDate=carPurchaseDate;
		this.bookedCarId=bookedCarId;
		this.bookingAmount=bookingAmount;
		this.bookingId=j;
	}
	//setter,getter-methods
	public String getClientName() 
	{
		return clientName;
	}

	public void setClientName(String clientName) 
	{
		this.clientName = clientName;
	}

	public int getClientId()
	{
		return clientId;
	}

	public void setClientId(int clientId) 
	{
		this.clientId = clientId;
	}

	public String getCarBookDate() 
	{
		return carBookDate;
	}

	public void setCarBookDate(String carBookDate) 
	{
		this.carBookDate = carBookDate;
	}
	
	public String getCarPurchaseDate()
	{
		return carPurchaseDate;
	}
	
	public void setCarPurchaseDate(String carPurchaseDate) 
	{
		this.carPurchaseDate = carPurchaseDate;
	}
	
	public int getBookedCarId() 
	{
		return bookedCarId;
	}
	
	public void setBookedCarId(int bookedCarId)
	{
		this.bookedCarId = bookedCarId;
	}
	
	public float getBookingAmount() 
	{
		return bookingAmount;
	}
	
	public void setBookingAmount(float bookingAmount)
	{
		this.bookingAmount = bookingAmount;
	}
	public int getBookingId()
	{
		return this.bookingId;
	}
	public String toString() {
		return "Booking Id"+this.bookingId+"Client Id:"+this.clientId+"Client Name:"+this.clientName+"Car Booking Date:"+this.carBookDate+"Car Purchase Date"+this.carPurchaseDate+"Booked car Id"+this.bookedCarId+"Booking Amount"+ this.bookingAmount;
	}
	
	
}
