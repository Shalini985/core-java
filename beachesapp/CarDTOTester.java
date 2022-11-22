package co.xwork.beachesapp;

import co.xwork.beachesapp.DTO.CarDTO;

public class CarDTOTester {
	public static void main(String a[]) {
		
		CarDTO car=new CarDTO();
		car.setName("omini");
		car.setId(23);
		car.getName();
		car.getId();
		
		
		
		
		
		System.out.println(car.getName());
		System.out.println(car.getId());
	}

}
