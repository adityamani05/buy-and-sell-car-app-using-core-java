package com.summarycar;


import com.beans.Car;
import com.beans.Date;

public interface Services {
	public int saleCar(String carName,String carModel,float carPrice,float carMlg,String carColor,String carCompanyName,String carType,String carOwnerName ,String carOwnerNo);
	public void searchCar(String carname);
	public int bookCar(String clientName,String carBookDate,String carPurchaseDate,int bookedCarId,float bookingAmount);
	public String cancelCar(int bookingid);
	public String buyCar(int bookingId);
	//public int registerCar(int carid);
	
}

