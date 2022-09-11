class EcommerceTester{
  public static void main(String a[]){
  Ecommerce.setSku("mesho");
   Ecommerce.setPrice(3000);
   Ecommerce.setPriceId(567);
   Ecommerce.setCarency("2 dolaars");
   System.out.println(Ecommerce.getSku()+ " " +Ecommerce.getPrice() + " "+Ecommerce.getPriceId()+ " "+Ecommerce.getCarency());
  
  }


}