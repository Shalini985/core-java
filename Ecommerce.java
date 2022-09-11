class Ecommerce{
 static String sku;
 static int priceId;
 static int price ;
 static String carency ;
 public static void setSku(String skuu){
  sku=skuu;
 
 }
 public static String getSku(){
	 return sku;
	 
 }
 public static void  setPrice(int pi){
	 price=pi;
 } 
 public static int getPrice(){
	 return price;
	 
 }
 
 public static void  setPriceId(int Id){
	 priceId=Id;
 } 
 public static int getPriceId(){
	 return priceId;
	 
 } 
  
 public static void  setCarency(String ca){
	 carency=ca;
 } 
 public static String getCarency(){
	 return carency;
	 
 }
}