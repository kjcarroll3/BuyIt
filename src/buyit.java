/*
 * Project Name: BuyIt
 * Created by: Evan Law, Kenneth Carroll, Tsun (Jaeryn) Chu
 * Date: 23 07 2015
 * ICS491
 */

// Libraries to import
import java.util.*;

public class buyit {
	private static final Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

	//Other Variables
	int userInput = 0; //UI flag
	int uauth = 0;	//User authentication flag
	
	//Global Variables
	String uid = null;
	String pwd = null;
	String pwd2 = null;
	String fname = null;
	String lname = null;
	String addr = null;
	String city = null;
	String state = null;
	String email = null;
	String search = null;
	int zip = 0;
	int cc_num = 0;
	
	try{
		while (userInput != 4){
			//Message to User
			System.out.println("What would you like to do? ");
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
				
				System.out.println("Username desired:\n");  //Ask for username desired
				uid = input.nextLine();
				
				System.out.println("Password:\n"); //ask for password for user account
				System.out.println("For account security, BuyIy accounts are required to meet the following requirements:");
				System.out.println("1. Password must contain at least one UPPERCASE and LOWERCASE character.");
				System.out.println("2. Password must have at least one special character. eg. !,@,#,$,%,&");
				System.out.println("3. Password must be at least 12 characters long.\n");
				pwd = input.nextLine();
				
				System.out.println("Retype Password entered:\n"); //ask for password for user account (for comparison)
				pwd2 = input.nextLine();
				
				//Call password function
				CheckPassword(pwd, pwd2);
				
				System.out.println("First Name:\n");
				fname = input.nextLine();
				
				System.out.println("Last Name:\n");
				lname = input.nextLine();
				/*
				System.out.println("Address:\n");
				addr = input.nextLine();
				
				System.out.println("City:\n");
				city = input.nextLine();
				
				System.out.println("State:\n");
				state = input.nextLine();
				
				System.out.println("Zip Code:\n");
				zip = input.nextInt();
				
				System.out.println("Email Address:\n");
				email = input.nextLine();
				
				System.out.println("Credit Card No.:\n");
				cc_num = input.nextInt();
				*/
				
				//Print out all information onto the screen
				System.out.println("Your username is: " + uid + " and your password is: " + pwd);
				System.out.println("Congratulations " + fname + " " + lname +" ! Welcome to BuyIt!");
				System.out.println("Please login to your BuyIt account to use site features!");
			}
			else if (userInput == 2) //User login
			{
				System.out.println("You have selected to login!");
				
				//User enter credentials
				//String uid;
				System.out.println("Enter Username:\n");
				uid = input.nextLine();
				
				//String pwd;
				System.out.println("Enter Password:\n");
				pwd = input.nextLine();
				
				// Look up db for exact credentials
				// compare if they are the same
				
				//Sucess Message
				System.out.println("Your credentials match! Login was a sucess!\n");
				uauth = uauth + 20; //user authentication flag
				
				//Allow user to access other interfaces
			}
			else if (userInput == 3) //Search ADs
			{
				//String search;
				System.out.println("What are you searching for? ex. car \n");
				search = input.nextLine();
			}
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	
	}
	
	/* 
	 * This function checks if the password matches and 
	 * if the password matches the conditions for user accounts.
	 */
	public static void CheckPassword(String a, String b)
	{
		boolean match = a.equals(b);					 //Check if passwords match
		boolean Uppercase = !a.equals(a.toLowerCase());  //Check if password has uppercase
		boolean Lowercase = !a.equals(a.toUpperCase());  //Check if password has lowercase
		boolean min_length = a.length() >= 12;			 //Check if password is at least 12 or more
		boolean special = !a.matches("[A-za-z0-9 ]*");	 //Check if password has special characters
		boolean conditions = !(a.contains("AND") || a.contains("NOT")); 
		
		if (!match) 
			{
				System.out.println("Warning! The passwords entered don't match!\n"); 
				return;
			}
		if (!Uppercase) System.out.println("Password must contain an uppercase!\n");
		if (!Lowercase) System.out.println("Password must contain an lowercase!\n");
		if (!min_length) System.out.println("Password must be at least 12 characters long!\n");
		if (!special) System.out.println("Password must contain a special character!\n");
		
	}
}
