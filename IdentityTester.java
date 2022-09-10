class IdentityTester{
public static void main(String a[]){
	System.out.println("MAIN METHOD STARTED,,");

Identity.printName();
Identity.printNameAndEmail("shalini", "shalinimd985@gamil");
Identity.printNameAndMoblieNo("shalini", 9606265560L);
Identity.printNameAndAge("shalini", 24);
Identity.printNameAndAddress("shalini", "mulenahalli");
Identity.printNameAndEmailAndAddressAndAge("shalini", "shalinimd985@gamil", "mulenahalli",24);
Identity.printNameAndGender("shalini", 'F');
Identity.printNameAndWorking("shalini", "Engineering");
Identity.printNameAndShirtSize("shalini", "medium");
Identity.printNameAndPantSize("shalini", 34);
Identity.printNameAndWeightAndHeight( "shalini", 50, 4.9);
System.out.println("MAIN METHOD ENDED......");
}
}