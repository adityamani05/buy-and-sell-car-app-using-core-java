package com.services;

import com.beans.Car;
import com.beans.CarOwner;
import com.beans.Client;
import com.beans.Date;
import com.beans.Prime;
import com.beans.Suv;
import com.beans.Xuv;
import com.summarycar.Services;

public class AccountServices implements Services{

	private Car[] CarArr = new Car[5];
	private Client[] ClientArr = new Client[5];
	private CarOwner[] OwnArr = new CarOwner[5];
	private int i=-1;
	private int k=-1;
	
	@Override
	public int saleCar(String carName, String carModel, float carPrice, float carMlg, String carColor,
			String carCompanyName,String carType,String carOwnerName ,String carOwnerNo) {
		i++;
		if(carType.equals("Suv")){
		CarArr[i]=new Suv(carName,carModel,carPrice,carMlg,carColor,carCompanyName,carType);
		OwnArr[i]=new CarOwner(carOwnerName,carOwnerNo,CarArr[i].getCarId());
		
		return CarArr[i].getCarId();
		}
		if(carType.equals("Xuv")){
			CarArr[i]=new Xuv(carName,carModel,carPrice,carMlg,carColor,carCompanyName,carType);
			OwnArr[i]=new CarOwner(carOwnerName,carOwnerNo,CarArr[i].getCarId());
		
			return CarArr[i].getCarId();
		}
		if(carType.equals("Prime")){
			CarArr[i]=new Prime(carName,carModel,carPrice,carMlg,carColor,carCompanyName,carType);
			OwnArr[i]=new CarOwner(carOwnerName,carOwnerNo,CarArr[i].getCarId());
			
			return CarArr[i].getCarId();
			}
		else {
			System.out.println("Car type not found");
			return 0;
		}
		
		
	}

	
	@Override
	public void searchCar(String carname) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++)
		{
			
			if(CarArr[i].getCarName().equals(carname))
			{
				System.out.println("Car Id:"+CarArr[i].getCarId()+"\tCar Name:"+CarArr[i].getCarName()+"\tCar Model:"+CarArr[i].getCarModel()+"\tCar Price:"+CarArr[i].getCarPrice()+"\tCar Milege:"+CarArr[i].getCarMlg()+"\tCar Color:"+CarArr[i].getCarColor()+"\tCar company:"+CarArr[i].getCarColor()+"\tCar Owner Name:"+OwnArr[i].getCarOwnerName());
			}	
		}
		//System.out.println("Car type not found");
	}

	@Override
	public int bookCar(String clientName,String carBookDate,String carPurchaseDate,int bookedCarId,float bookingAmount) {
		// TODO Auto-generated method stub
		k++;
		ClientArr [k]= new Client(clientName,carBookDate,carPurchaseDate,bookedCarId,bookingAmount);
		
		return ClientArr[k].getBookingId();
	}

	@Override
	public String cancelCar(int bookingid) {
		// TODO Auto-generated method stub
		//int a =bookingid-500;
		int a=1;
		for(int i=0;i<2;i++)
		{
			if(bookingid==(ClientArr[i].getBookingId()))
			{
				ClientArr[i]=null;
				System.out.println("Booking Cancel");
				a++;
			}
		}
		if(a==1) {
		System.out.println("No Booking Found");
		
	}
		return null;
	}

	@Override
	public String buyCar(int bookingid) {
		// TODO Auto-generated method stub
		for(int i=0;i<2;i++)
		{
			if(bookingid==(ClientArr[i].getBookingId()))
			{
				float x = ClientArr[i].getBookingAmount();
				int y = ClientArr[i].getBookedCarId()-100;
				float z = CarArr[y].getCarPrice();
				float price = z-x;
				System.out.println("Pay Rs."+price+"\n Take your car..");
				return "";
			}
		}
		System.out.println("No Booking Found");
		return null;
	}
/*	@Override
	public int registerCar(String carOwnerName,String carOwnerNo , int CarArr[i].getCarId()) {
		// TODO Auto-generated method stub
		i++;
		OwnArr[i]=new CarOwner(carOwnerName,carOwnerNo,CarArr[i].getCarId());
		return 0;
	}
*/
}
