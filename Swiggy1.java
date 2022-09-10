class Swiggy1{
   public static double takeOrder( String item, int quantity){
   
    String item ="pastries";
	if(item=="pizza"){
	System.out.println("Thank you for ordering" + item);
	return 60*quantity;
	}
	if(item=="burgar"){
	
	System.out.println("Thank you for ordering" + item);
	return 67*quantity;
	}
	if(item=="sandwitch"){
	
	System.out.println("Thank you for ordering" + item);
	return 56*quantity;
	}
	if(item=="mossaranna"){
	
	System.out.println("Thank you for ordering" +item);
	return 45*quantity;
	}
	if(item=="southIndian"){
	
	System.out.println("Thank you for ordering" + item);
	 return 78*quantity;
	}
	if(item=="pastries"){
	
	System.out.println("Thank you for ordering" + item);
	return 78*quantity;
	}
	return 0.0;
   
   
   }








}