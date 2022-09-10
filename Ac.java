class Ac{
 static String brandName;
 static double price;
 static String color;
 static boolean isWorking;
 static int minVolume;
static int maxVolume=8;

static int currentVolume;
  
 public static boolean onOrOf(){
 System.out.println("inside the main");
 if (isWorking==true){
 isWorking=false;
 System.out.println("Is working on........");
 }
  else if (isWorking==false){
 isWorking=true;
 System.out.println("Is working of........");
 }
 System.out.println("ended the main");
 return isWorking;
 
}
public static void increaseVolume(){
	  System.out.println("inside increaseVolume()");
	  if(isWorking == true){
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
	  if (isWorking == true){
		  
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


	






