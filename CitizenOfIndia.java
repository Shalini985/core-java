class CitizenOfIndia{
    
      public  static void showTheResponsibility( int age ,char gender){
	  
	  
	  //int age = 13;
	  //char gender ='F';
	  //AND OPERATORE
	  //OR OPERATORE
	  //sigriate the conditions in 1 if will use && and the both the condition are true
	  
	  
	  if(age>= 10 && age < 16){
	  System.out.println("Responsibility is School");
	  return;
	 }
	  if(age == 16)
	  {
	  System.out.println("Responsibility is college");
	  return;
	  }
	  if (age >= 18){
	   System.out.println("Responsibility is voting");
	   if(gender =='F'){
		   System.out.println("Gril can leggally marry");
	   }
	   else{
		   System.out.println("Boy can  not marry");
	   }
	   
		   System.out.println("end of the showTheResponsibility");
	   
	   
	  }
	  
	  }
}