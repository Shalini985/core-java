package com.xworkz.fristtime.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class springconfiguration {
	public springconfiguration() {
System.out.println("constor is created");	
}
	@Bean("developer")

	public String softwareDeveloper() {
		return "Java Developer";
	}
	@Bean("free")

	public boolean softwarefree() {
		return true;
	}
	@Bean("varsion")

	public String softwareVersion() {
		return "Java 1.8";
	}
	@Bean("name")

	public String softwareName() {
		return "JDK";
	}
	@Bean("ownerName")

	public String HardwareShopOwnerName() {
		return "Manu";
	}

	@Bean("address")
	public String HardwareShopAddress() {
		return "Banglore";
	}

	@Bean("name")

	public String HardwareShopName()

	{
		return "Ganesh Hardware Shop";
	}

	@Bean("id")
	public int HardwareShopId() {

		return 10;
	}

	@Bean("gstNo")
	public String HardwareShopGstNo() {
		return "GSTIN202253456";
	}
	@Bean("engineername")

	public String softwareEngineerName() {
		return "Hareesha";
	}

	@Bean("engineerCompany")

	public String softwareEngineerCompany() {
		return "FirstAmerica";
	}

	@Bean("engineerSalary")

	public Double softwareEngineerSalary() {
		return 553120D;
	}

	@Bean("experience")
	public int softwareEngineerExpperience() {
		return 12;
	}

	@Bean("color")
	public String pencilColor() {
		return "Red";
	}

	@Bean("Pencilname")

	public String pencilName() {
		return "Nataraj";
	}

	@Bean("type")
	public String penciltype() {
		return "Writing";
	}

	@Bean("pencilprice")
	public Double pencilPrice() {
		return 10.5;
	}

	@Bean("Sharp")
	public Boolean pencilSharp() {
		return false;
	}

	@Bean("stolen")
	public Boolean pencilStolen() {
		return false;
	}

	@Bean("rubberStolen")
	public Boolean rubberStolen() {
		return false;
	}

	@Bean("rubberName")
	public String rubberName() {
		return "Apsara";
	}

	@Bean("rubberType")
	public String rubberType() {
		return "Rubber";
	}

	@Bean("rubberColor")
	public String rubberColor() {
		return "White";
	}

	@Bean("rubberShape")
	public String rubberShape() {
		return "Square";
	}

	@Bean("rubberSize")
	public int rubberSize() {
		return 2;
	}

	@Bean("rubberPrice")
	public double rubberPrice() {
		return 102.0;
	}

	@Bean("bekaryName")
	public String bekaryName() {
		return "Manjunath";
	}

	@Bean("bekaryAddress")
	public String bekaryAddress() {
		return "Bengalore";
	}

	@Bean("bekaryOwnerName")
	public String bekaryOwnerName() {
		return "Ravi Teja";
	}

	@Bean("bekaryState")
	public String bekaryState() {
		return "Karnataka";
	}

	@Bean("bekaryProduct")
	public String bekaryProduct() {
		return "Bread";
	}
	
	@Bean("workers")
	public int bekaryNoOfWorkers()
	{
		return 10;
	}
	
	@Bean("area")
	public String bekaryArea()
	{
		return "Kelmbelli";
	}
	
	@Bean("bekaryPinCode")
	public int bekaryPinCode()
	{
		return 577542;
	}
	@Bean("bekaryDate")
	public LocalDate bekarydate()
	{
		return LocalDate.now();
	}
}



