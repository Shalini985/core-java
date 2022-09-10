class Cards{
   static String cards[]={"atm","pancard","creditcard","debitcard"};
   static String name[]={"shalini","punith"} ;
static String user[]={"spandana","raghu"};
   static String debitCardUser[]={"geetha" ,"punith","sharth"};
   static String creditCardUser[]={"dharmappa","jaya"};
   public static void main(String a[]){
	   System.out.println(" The creditCard names");
	   for( int m=0;m<name.length;m++){
		 System.out.println(name[m]);  
	   }
	   System.out.println(" The Creditcard user");
   for (int n=0;n<user.length;n++){
    System.out.println( user[n]);
   }	
   System.out.println("*******************");
   System.out.println("cards names");
   for(int i=0; i<cards.length; i++){
   System.out.println(cards[i]);
 
   
   }
   System.out.println("*******************");
   System.out.println("debitCardUser name");
   for (int j=0; j<debitCardUser.length ;j++){
   
   System.out.println(debitCardUser[j]);
   }
   System.out.println("*******************");
   System.out.println("creditCardUser name");
   for (int k=0; k<creditCardUser.length; k++){
   System.out.println(creditCardUser[k]);
    }
   
   }





}