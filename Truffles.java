class Truffles{
   public static void main ( String a[]){

	 String type = "5 star Hotel";
	 String address = "bangalore";
	 String[] managerNames = {"shalini", "spandana", "sangeetha","geetha","pooja"};
	 int noOfManagers = 5;
	 String foodMenu[]={"masaladose","kabab","sweet corn","french fries","noddles","chikken biriyani","pani puri","rotti","fish curry","motton curry", "fish finger","fish fry","shavarma","motton biriyani","chapathi","masalrotti","payasa",};
	 String sweetFoodMenu[]={"payasa","mitayi","obbattu"};
	System.out.println("Welcome to vivantatajhotel");
    System.out.println("Which star hotel is " + type);
    System.out.println("The hotel " + address);
    System.out.println("Hotel managerNames are");
		  for (int  i=0; i<managerNames.length;i++){
	System.out.println(managerNames[i]);
		  }
		  System.out.println("Hostel foodMenu are");
		 for (int j=0; j<foodMenu.length; j++){
	System.out.println(foodMenu[j]);
		 }
	for (int  k=0; k<sweetFoodMenu.length;k++){
	
	System.out.println(sweetFoodMenu[k]);
	}
		  
		  
	 }
	 
}



