class Identity{
	static String name;
	static String email;
	static long moblieNo;
	static int age;
	static String address;
	static char gender;
	static String working;
	static String shirtSize;
	static int pantSize;
	static int weight;
	static double height;
	
  public static void printName(){
  System.out.println( name);
  return ;
  }
  public static void printNameAndEmail(String name,String email){
  System.out.println( name + " " +email);
  return;
  
  }
  public static void printNameAndMoblieNo(String name , long moblieNo){
  System.out.println( name + " "  +moblieNo );
  return; 
  
  }
  public static void printNameAndAge(String name, int age){
  System.out.println(name + " " + age);
  return;
  }
  public static void printNameAndAddress(String name, String address){
  System.out.println(name + " " + address);
  return;
  }
  public static void printNameAndEmailAndAddressAndAge(String name, String email, String address,int age){
  System.out.println( name +" "  + email + " " +address+ "" + age);
  return;
  }
  public static void printNameAndGender(String name, char gender){
  System.out.println( name + " "+gender);
 return;
  }
  
  public static void printNameAndWorking(String name, String working){
  System.out.println( name + " " +working);
  return;
  
  }
  public static void printNameAndShirtSize(String name, String shirtSize){
  System.out.println(name +" " +shirtSize);
  return;
  }
  public static void printNameAndPantSize(String name, int pantSize){
  System.out.println( name + " " + pantSize);
  return;
  }
  public static void printNameAndWeightAndHeight(String name, int weight,double height){
  System.out.println(weight + " " +height);
  return;
  }
  
  }