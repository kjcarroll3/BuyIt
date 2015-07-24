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

	//Variable for user to choose selection
	int userInput = 0;
	
	//Global Variables
	String uid;
	String pwd;
	String pwd2;
	String fname;
	String lname;
	String addr;
	String city;
	String state;
	String email;
	String search;
	int zip;
	int cc_num;
	
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
				
				//String uid;
				System.out.println("Username desired:\n");  //Ask for username desired
				uid = input.nextLine();
				
				//String pwd;
				System.out.println("Password:\n"); //ask for password for user account
				pwd = input.nextLine();
				
				//Check if password is empty
				
				//String pwd2;
				System.out.println("Retype Password:\n"); //ask for password for user account (for comparison)
				pwd2 = input.nextLine();
				
				//Call password function
				CheckPassword(pwd, pwd2);
				
				//String fname;
				System.out.println("First Name:\n");
				fname = input.nextLine();
				
				//String lname;
				System.out.println("Last Name:\n");
				lname = input.nextLine();
				
				//String addr;
				System.out.println("Address:\n");
				addr = input.nextLine();
				
				//String city;
				System.out.println("City:\n");
				city = input.nextLine();
				
				//String state;
				System.out.println("State:\n");
				state = input.nextLine();
				
				//int zip;
				System.out.println("Zip Code:\n");
				zip = input.nextInt();
				
				//String email;
				System.out.println("Email Address:\n");
				email = input.nextLine();
				
				//int cc_num;
				System.out.println("Credit Card No.:\n");
				cc_num = input.nextInt();
				
				//Print out all information onto the screen
				
			}
			else if (userInput == 2) //User login
			{
				System.out.println("You have selected to login!");
				
				//User enter credentials
				//String uid;
				System.out.println("Username:\n");
				uid = input.nextLine();
				
				//String pwd;
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
				//String search;
				System.out.println("What are you searching for? ex. car \n");
				search = input.nextLine();
			}
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	
	}
	
	//Password checking function
	//Checks if pwd and pwd2 are the same
	//Checks if pwd is alphanumeric and at least 12 characters
	public static void CheckPassword(String a, String b)
	{
		int flag = 0;
		
		//Compare string a to string b
		if (a.equals(b))
		{
			flag = flag + 1; //flag counter
		}
		else
		{
			flag = 0;
		}
		
		//validate password for requirements
		if (a.matches("[A-Za-z0-9]+")) //bug
		{
			flag = flag + 1;
		}
		else
		{
			flag = flag + 0;
		}
		
		//check if password is at least 12 characters long
		if (a.length() >= 12)
		{
			flag = flag + 1;
		}
		else
		{
			flag = flag + 0;
		}
		
		//validation message
		if (flag == 1)
		{
			System.out.println("Passwords match!\n");
			System.out.println("Password doesn't meet minimum requirements!\n");
		}
		else if (flag == 2)
		{
			System.out.println("Passwords match!\n");
			System.out.println("Password meets minimum requirements!\n");
		}
		else if (flag == 3)
		{
			System.out.println("Password meets all requirements!\n");
		}
		else
		{
			System.out.println("Passwords entered don't match!\n");
			System.out.println("Password doesn't meet minimum requirements!\n)");
		}
	}
}
