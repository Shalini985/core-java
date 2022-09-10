class Speaker{
static String brandName;
static String color;
static double price;
static boolean isConnected;
static int minVolume;
static int maxVolume=8;

static int currentVolume;





  public static boolean onOrOf(){
  System.out.println("inside onOrOf()");
    if(isConnected ==false){
            isConnected = true;
			System.out.println("Speaker is turned on....");
  }
	   else if(isConnected == true){
	    isConnected = false;
		System.out.println("Speaker is turned off....");
		}		
 
  System.out.println("ended of onOrOf()");
  return isConnected ;
  
  }
  
  
  public static void increaseVolume(){
	  System.out.println("inside increaseVolume()");
	  if(isConnected == true){
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
	  if (isConnected == true){
		  
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












