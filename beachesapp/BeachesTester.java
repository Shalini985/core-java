package co.xwork.beachesapp;

import co.xwork.beachesapp.DTO.BeachesDTO;

public class BeachesTester {


	public static void main(String s[]) {

		BeachesDTO be=new BeachesDTO();
		
		be.setName("malpe");
		be.setId(679);
	
		be.getName();
		be.getId();
	
		System.out.println(be.getName()+ " "+be.getId());
		
		
		
	}
	}



