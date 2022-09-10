class SpeakerTester{
 public static void main(String a[]){
 System.out.println("Main mathod is started");
 
 Speaker.brandName = "Boat";
 Speaker.color = "white";
 Speaker.price = 3000.00;
 
 Speaker.onOrOf();
  Speaker.increaseVolume();
  Speaker.increaseVolume();
  Speaker.decraseVolume();
  
  Speaker.increaseVolume();
  Speaker.increaseVolume();
  Speaker.decraseVolume();
  Speaker.onOrOf();
  
 Speaker.increaseVolume();
 
 Speaker.decraseVolume();
 
 
 Speaker.onOrOf();
 
 System.out.println("brandName is " +Speaker.brandName);
 System.out.println("speaker color" + Speaker.color);
 System.out.println("Speaker price is" + Speaker.price);
 System.out.println("main method is ended");
 
 
 
 }




}