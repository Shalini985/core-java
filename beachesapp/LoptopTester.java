package co.xwork.beachesapp;

import co.xwork.beachesapp.DTO.LoptopDTO;

public class LoptopTester {
public static void main(String s[]) {

	LoptopDTO lop=new LoptopDTO();
	
	lop.setLoptopName("del");
	lop.setId(678);
	lop.setModelName("barand");
	lop.getLoptopName();
	lop.getId();
	lop.getModleName();
	System.out.println(lop.getLoptopName()+ " "+lop.getId()+ " "+ lop.getModleName());
	
	
	
}
}
