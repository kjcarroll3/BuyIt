// Libraries
import java.util.*;

public class buyit {
	private static final Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

	//Variable for user to choose selection
	int userInput = 0;
	
	try{
		while (userInput != 4){
			//Message to User
			System.out.println("What would you like to do? \n");
			System.out.println("1 - User Registration \n");
			System.out.println("2 - User Login \n");
			System.out.println("3 - Search ADs \n");
			System.out.println("4 - Exit \n");
			
			//Catch numerical input for the var. userInput
			userInput = input.nextInt(); 
			input.nextLine();
			
			if (userInput == 1) //User Registration Value
			{
				System.out.println("You have selected User Registration. Please complete the following: \n");
				
				String uid;
				System.out.println("Username desired:\n");  //Ask for username desired
				uid = input.nextLine();
				
				String pwd;
				System.out.println("Password:\n"); //ask for password for user account
				pwd = input.nextLine();
				
				String pwd2;
				System.out.println("Retype Password:\n"); //ask for password for user account (for comparison)
				pwd2 = input.nextLine();
				
				//Compare the password enter with the retyped password
				
				//Validate password for conditions (alphanumerical, at least 12 chars)
				
				System.out.println("First Name:\n");
				
				System.out.println("Last Name:\n");
				
				System.out.println("Address:\n");
				
				System.out.println("City:\n");
				
				System.out.println("State:\n");
				
				System.out.println("Zip Code:\n");
				
				System.out.println("Email Address:\n");
				
				System.out.println("Credit Card No.:\n");
				
			}
			else if (userInput == 2) //User login
			{
				System.out.println("You have selected to login!");
				
				//User enter credentials
				String uid;
				System.out.println("Username:\n");
				uid = input.nextLine();
				
				String pwd;
				System.out.println("Password:\n");
				pwd = input.nextLine();
				
				// Look up db for exact credentials
				// compare if they are the same
				
				//Sucess Message
				System.out.println("Your credentials match! Login was a sucess!\n");
				
				//Allow user to access other interfaces
			}
			else if (userInput == 3) //Search ADs
			{
				String search;
				System.out.println("What are you searching for? ex. car \n");
				search = input.nextLine();
			}
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	
	}
}
