// Libraries
import java.util.*;

public class buyit {
	private static final Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

	int userInput = 0;
	
	try{
		while (userInput != 4){
			System.out.println("What would you like to do? \n");
			userInput = input.nextInt();
			input.nextLine();
			
			if (userInput == 1) //User Registration Value
			{
				System.out.println("You have selected User Registration. Please complete the following: \n");
				String uid;
				System.out.println("Username:\n");
				uid = input.nextLine();
				
			}
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	
	}
}
