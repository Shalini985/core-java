class Hotstar{
      static String serialName[]={"marali manasagide","honganasu","rajii","bettada hoo","ardangi"};
      static String serialActorName[]={"chandan","shruthi","sharan","bhoomi"};
       static int price=356;
       static String serialVillanName[]={"ravi sankar","dali","malini"};	  
       static String serialComedyName[]={"sadukokila","chikkanna","komal","doddanna"};
	   public static void main(String a[]){
	   
	   System.out.println("the hotstar price is " + price);
	   
	   for( int i=0;i<serialName.length;i++){
	   
	   System.out.println(serialName[i]);
	   }
     System.out.println("************************"); 
System.out.println("serialActorName");	 

      for(int j=0;j<serialActorName.length;j++){
	  System.out.println(serialActorName[j]);
	  
	  
	  
	  }
	  System.out.println("***************");
	  System.out.println("serialComedyName");
	  for(int k=0;k<serialComedyName.length;k++){
	  System.out.println(serialComedyName[k]);
	  }
	  System.out.println("**********************");
	  System.out.println("serialVillanName");
	  for(int m=0;m<serialVillanName.length;m++){
	  System.out.println(serialVillanName[m]);
	  }




}
}