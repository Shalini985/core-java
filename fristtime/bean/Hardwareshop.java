package com.xworkz.fristtime.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Hardwareshop {

	@Autowired
	private int id;
	@Autowired
	@Qualifier("name")
	private String name;
	@Autowired
	@Qualifier("ownerName")
	private String ownerName;
	@Autowired
	@Qualifier("gstNo")
	private String GstNo;
	@Autowired
	@Qualifier("address")
	private String address;

	public Hardwareshop() {
		System.out.println("Hardware Shop Creating And  managing Construictor");
	}

	@Override
	public String toString() {
		return "HardwareShop [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", GstNo=" + GstNo
				+ ", address=" + address + "]";
	}

	

}
