class PgTester{
  public static void main(String a[]){
   Pg.setPgName("moon");
   Pg.setPrice(3700); 
   Pg.setPlace("bangalore");
   Pg.setArea("rajajinagar");
   System.out.println(Pg.getPgName()+ " "+ Pg.getPlace()+ " "+Pg.getPrice()+ " "+Pg.getArea());
  
  }


}