class WashingMachine{
 static String brandName;
 static String color;
 static double price;
 static boolean isFastWorking;
 static int minVolume;
static int maxVolume=8;

static int currentVolume;
  
 public static boolean onOrOf(){;
 System.out.println("inside the main");
 if(isFastWorking==false){
     isFastWorking=true;
	 System.out.println("is working fast");
	 
 
 }
   else if (isFastWorking==true){
 isFastWorking=false;
 System.out.println("is not fast working");
   }
 return isFastWorking;


}
public static void increaseVolume(){
	  System.out.println("inside increaseVolume()");
	  if(isFastWorking == true){
		if(currentVolume < maxVolume){
			currentVolume = currentVolume + 1;
			System.out.println("the current volume is : " + currentVolume);		
			}
  else {
	  System.out.println("Max volume reached......");
  }		
	  }  
  else {
	  
	  System.out.println("gube ..... speaker on madu");
	  
	  
  }
  System.out.println("end of increaseVolume");
  return ;
  }
  public static void decraseVolume(){
	  
	  System.out.println("inside the decraseVolume()");
	  if (isFastWorking == true){
		  
		  if (currentVolume > minVolume){
			  currentVolume= currentVolume -1;
			  System.out.println("the currentVolume is :" +currentVolume);
		  }
		  else {
			  System.out.println("max Volume reached.....");
			  
		  }
	  }
	  else {
		  System.out.println("gube speaker on madu");
		  return;
	  }
  }
}


	





