class BigBazaarTester{
     public static void main(String a[]){
	 
BigBazaar bazaar = new BigBazaar();
	bazaar.productName="Eye Shadow";
 bazaar.address="hassan";
 bazaar.price=80.00;
 System.out.println(bazaar.productName+" " + bazaar.price +" " +bazaar.address);
 
 
 BigBazaar bazaar1= new BigBazaar();
	bazaar1.productName="Fundation";
 bazaar1.address="belur";
  System.out.println(bazaar1.productName+" " + bazaar1.price +" " +bazaar1.address);
 
 
 BigBazaar bazaar2 = new BigBazaar();
	bazaar2.productName="poder";
 bazaar2.address="hassan";
 bazaar2.price	=20.00;
 System.out.println(bazaar2.productName+" " + bazaar2.price +" " +bazaar2.address);
 
 BigBazaar big=bazaar2;
 System.out.println(big.productName+" " + big.price +" " +big.address);
 
 
	 }
}