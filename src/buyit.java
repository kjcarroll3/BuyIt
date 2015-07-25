/*
 * Project Name: BuyIt
 * Created by: Evan Law, Kenneth Carroll, Tsun (Jaeryn) Chu
 * Date: 23 07 2015
 * ICS491
 */

// Libraries to import
import java.util.*;

public class buyit {
	
	//Global Variables
	static boolean match;
	static boolean Uppercase;
	static boolean Lowercase;
	static boolean min_length;
	static boolean special;
	static boolean conditions;
	static boolean pwd_condition = false;
	static boolean uid_exists = true;
	
	private static final Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {

	//Variables
	int userInput = 0; //UI flag
	int uauth = 0;	//User authentication flag
	
	String uid = null;
	String pwd = null;
	String pwd2 = null;
	
	try{
		while (uauth != 20){
			//Message to User
			printLoginMenu();
			
			//Catch numerical input for the var. userInput
			userInput = input.nextInt(); 
			input.nextLine();
			
			if (userInput == 1) //User Registration Value
			{
				while (uid_exists == true)
				{
					System.out.println("You have selected User Registration. Please complete the following: \n");
					System.out.print("Username desired: ");  //Ask for username desired
					uid = input.nextLine();
					System.out.println();
					//Check uid in db, if exists loop back
					
				}
				
				
				while (pwd_condition == false)
				{
					System.out.println("For account security, BuyIy accounts are required to meet the following requirements:");
					System.out.println("1. Password must contain at least one UPPERCASE and LOWERCASE character.");
					System.out.println("2. Password must have at least one special character. eg. !,@,#,$,%,&");
					System.out.println("3. Password must be at least 12 characters long.\n");
					System.out.print("Desired password: "); //ask for password for user account
					pwd = input.nextLine();
					
					System.out.print("Retype Password entered: "); //ask for password for user account (for comparison)
					pwd2 = input.nextLine();
					System.out.println();
					
					//Call password function
					checkPassword(pwd, pwd2);
				}

				getUserInfo();
				/*
				//Print out user information onto the screen
				System.out.println("Your username is: " + uid + " and your password is: " + pwd);
				System.out.println("Congratulations " + fname + " " + lname +" ! Welcome to BuyIt!");
				System.out.println("Your account has been created. Please login to your BuyIt account to use site features!");*/
			}
			else if (userInput == 2) //User login
			{
				System.out.println("You have selected to login!");
				
				//User enter credentials
				System.out.print("Enter Username: ");
				uid = input.nextLine();
				
				System.out.print("Enter Password: ");
				pwd = input.nextLine();
				
				// Connect to db
				
				// Lookup values for uid and pwd
				
				//if they are both true, go to sucess
				
				//else ask for credentials
				
				// Close connection
				
				//Sucess Message
				System.out.println("Your credentials match! Login was a sucess!\n");
				uauth = uauth + 20; //user authentication flag
				
				//Allow user to access other interfaces
			}
			else if (userInput == 3)
			{
				System.exit(0);  //Exit
			}
		}
		
		printRegisteredMenu(); //User has been authenticated, allow access
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
	}
	
	/* FUNCTION COMMENT */
	public static void printLoginMenu() 
	{
		System.out.println("What would you like to do? ");
		System.out.println("1 - User Registration");
		System.out.println("2 - User Login");
		System.out.println("3 - Exit");
	}
	
	/* FUNCTION COMMENT */
	public static void printRegisteredMenu() 
	{
		System.out.println("What would you like to do? ");
		System.out.println("1 - Search ADs");
		System.out.println("2 - Create AD");
		System.out.println("3 - View/Edit AD");
		System.out.println("4 - Exit");
	}
	
	/* 
	 * This function checks if the password matches and 
	 * if the password matches the conditions for user accounts.
	 */
	public static boolean checkPassword(String a, String b)
	{
		//check for whitespace
		match = a.equals(b);					 //Check if passwords match
		Uppercase = !a.equals(a.toLowerCase());  //Check if password has uppercase
		Lowercase = !a.equals(a.toUpperCase());  //Check if password has lowercase
		min_length = a.length() >= 12;			 //Check if password is at least 12 or more
		special = !a.matches("[A-za-z0-9 ]*");	 //Check if password has special characters
		
		if (!match) 
			{
				//Print warning. Return back to get password again
				System.out.println("Warning! The passwords entered don't match!\n"); 
				return pwd_condition = false;
			}
		else 
		{
			if (!Uppercase || !Lowercase || !min_length || !special) 
			{
				System.out.println("Password doesn't meet requirements!\n");
				return pwd_condition = false;
			}
			else
			{
				//Write uid and pwd to db
					
				return pwd_condition = true;
			}
		}
	} //end of check password function
	
	public static void getUserInfo() 
	{
		String fname = null;
		String lname = null;
		String addr = null;
		String city = null;
		String state = null;
		String email = null;
		String search = null;
		String zip = null;
		String cc_num = null;
				
					System.out.println("First Name:\n");
					fname = input.nextLine();
					
					System.out.println("Last Name:\n");
					lname = input.nextLine();
					
					System.out.println("Address:\n");
					addr = input.nextLine();
					
					System.out.println("City:\n");
					city = input.nextLine();
					
					System.out.println("State:\n");
					state = input.nextLine();
					
					System.out.println("Zip Code:\n");
					zip = input.nextLine();
					
					System.out.println("Email Address:\n");
					email = input.nextLine();
					
					System.out.println("Credit Card No.:\n");
					cc_num = input.nextLine();
					
					//Connect to db
					
					//Write data to db fields
					
					//Close connection
					
	} //end of get user information function
}
