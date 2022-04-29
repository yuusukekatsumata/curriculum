package check;

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
	
	
    Pet user1 = new Pet("java吉","hoge");
    user1.introduce();
    
    RobotPet user2 = new RobotPet("R2D2","ルーク");
    user2.introduce();
    
    
	}
}
