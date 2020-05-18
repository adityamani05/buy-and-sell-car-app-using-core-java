package Client;

import com.provider.Provider;
import com.summarycar.Services;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Services s1= Provider.getObject();
		System.out.println("Car Id:"+s1.saleCar("Verna", "VER2018", 1100000.0f, 18.2f, "Black", "Hyundai", "Prime","Anirban","9998887770"));
		System.out.println("Car Id:"+s1.saleCar("Honda-city", "HCITY2018", 1300000.0f, 16.2f, "White", "Honda", "Prime","Anmol","1230987890"));
		System.out.println("Car Id:"+s1.saleCar("Endevour", "END2019", 3300000.0f, 16.0f, "Red", "Ford", "Xuv","Sakshi","9998887770"));
		System.out.println("Car Id:"+s1.saleCar("Fortuner", "FOT2019", 3700000.0f, 14.0f, "White", "Toyata", "Xuv","Aditya","93333387770"));
		System.out.println("Car Id:"+s1.saleCar("Aspire", "ASP2019", 900000.0f, 20.0f, "Silver", "Ford", "Suv","Anmol","9944447770"));
		System.out.println();
		s1.searchCar("Verna");
		s1.searchCar("Aspire");
//		s1.searchCar("i10");
		System.out.println();
		System.out.println("Car booking Id:"+s1.bookCar("Aditya", "12,07,2019","18,07,2019" , 101, 100000));
		System.out.println("Car booking Id:"+s1.bookCar("Anmol", "12,07,2019","20,07,2019" , 102, 300000));
		System.out.println("Car booking Id:"+s1.bookCar("Anmol", "12,07,2019","20,07,2019" , 103, 300000));
		System.out.println();
		s1.cancelCar(502);
		System.out.println();
		s1.buyCar(501);
		
	}

}

