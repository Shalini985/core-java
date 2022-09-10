class WashingMachineTester{
    public static void main(String a[]){
	System.out.println("the main method is started");
	WashingMachine.brandName="usha";
	WashingMachine.color="brown";
	WashingMachine.price=18000.00;
	WashingMachine.onOrOf();
	WashingMachine.decraseVolume();
	WashingMachine.decraseVolume();
	
	WashingMachine.onOrOf();
	WashingMachine.increaseVolume();
	WashingMachine.onOrOf();
	System.out.println("the brandName is "+ WashingMachine.brandName);
	System.out.println("the price is "+WashingMachine.price);
	System.out.println("the color is "+WashingMachine.color);
	
	System.out.println("the main method is ended");
	
	
	
	
	
	}
}