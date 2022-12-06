package com.xwork.hospitalapp.hospitals;

import java.util.Scanner;




public class ApolloHospitalsTester {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size: ");
		int size = scanner.nextInt();
		
		ApolloHospitals apollo = new ApolloHospitals(size);
		
		for (int i = 0; i < size; i++) {
		Patient patient = new Patient();
		System.out.println("Enter the patientName: ");
		patient.setPatientName(scanner.next());
		
		System.out.println("Enter the age: ");
		patient.setAge(scanner.nextInt());
		
		System.out.println("Enter the address: ");
		patient.setAddress(scanner.next());
		
		System.out.println("Enter the Gender: ");
		String gender = scanner.next();
		patient.setGender(Gender.valueOf(gender));
		
	
		apollo.addPatient(patient);	
	
		apollo.getAllPAtients();
		
		System.out.println("Enter the patient name");
		String patientName = scanner.next();
		apollo.getPatientByName(patientName);
	
		System.out.println("Enter the patient age");
		int age = scanner.nextInt();
		apollo.getPatientByAge(age);
		
		System.out.println("Enter the patient address");
		String address = scanner.next();
		apollo.getPatientByAddress(address);
		
		System.out.println("Enter the patient gender");
		String gender1 = scanner.next();
		apollo.getPatientByGender(Gender.valueOf(gender1));
		
		System.out.println("Enter the patient gender");
		String gender11 = scanner.next();
		apollo.getPatientNameByGender(Gender.valueOf(gender11));
		
		System.out.println("Enter the patient name");
		String patientName1 = scanner.next();
		apollo.getGenderByPatientName(patientName1);
	}

	}
}
