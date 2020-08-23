

/*
2.  Variables: String & Char

Name and intitials
Write a program that a program that has the following String variables: firstName, middleName, and lastName.  Initialize these with your first, middle and 
last names.  The program should also have the following char variables:  firstInitial, middleInitial, and lastInitial.  Store your first, middle and last initials in these 
variables.  The program should display the contents of these variables on the screen.

Notes:  Strings are declared by using <String> with < " " >.  Characters are declared through < char > with < ' ' >.

*/

public class variables_StringAndChar{
	public static void main (String [] args){
		//variables
		String firstName;
		String lastName;
		String middleName;
		
		char firstInitial;
		char middleInitial;
		char lastInitial;
		//input
		//processing 
		firstName = "Kellan";
		lastName = "Willis";
		middleName = "Graham";
		
		firstInitial = 'K';
		middleInitial = 'G';
		lastInitial = 'W';
	
		//output 
		System.out.println (" My full name is: " + firstName + " " + middleName + " " + lastName);
		System.out.println (" My initials are: " + firstInitial + " | " + middleInitial + " | " + lastInitial);
		
		
	}
}
