package com.xworkz.fristtime.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Bekary {

	@Autowired
	@Qualifier("bekaryName")
	private String name;
	@Autowired
	@Qualifier("bekaryOwnerName")
	private String OwnerName;
	@Autowired
	@Qualifier("bekaryAddress")
	private String address;
	@Autowired
	@Qualifier("bekaryState")
	private String state;
	@Autowired
	@Qualifier("bekaryProduct")
	private String product;
	@Autowired
	@Qualifier("workers")
	private int noOfWorkres;
	@Autowired
	@Qualifier("bekaryDate")
	private LocalDate openDate;
	@Autowired
	@Qualifier("bekaryPinCode")
	private int pinCode;
	@Autowired
	@Qualifier("area")
	private String area;

	@Override
	public String toString() {
		return "Bekary [name=" + name + ", OwnerName=" + OwnerName + ", address=" + address + ", state=" + state
				+ ", products=" + product + ", noOfWorkres=" + noOfWorkres + ", openDate=" + openDate + ", pinCode="
				+ pinCode + ", area=" + area + "]";
	}




}
