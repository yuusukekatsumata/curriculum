package check;

import constants.Constants;

public class Check {
	
	//課題①
	private static String firstName = "勝又";
    private static String lastName = "悠介" ;
    
    //課題②
    private static String printName(String firstName, String lastName) {
			 return firstName + lastName;
		  }
    
    public static void main(String[] args) {
	
	System.out.println("printNameメソッド→" + printName(firstName, lastName));
	
    
    
	//課題③

    Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
    RobotPet robotoPet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
    
    pet.introduce();
    robotoPet.introduce();
    
 }
}
             