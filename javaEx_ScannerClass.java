/*
This program focuses on using the Scanner Class
To use the Scanner Class:

1. Import the Scanner Class < import java.util.Scanner >

2. Declare a scanner variable < Scanner variable = new Scanner (System.in);

3. Create the user input (Integer):
	<System.out.println ("output statment");
	<variable = scannerVariable.nextInt;

*/
import java.util.Scanner;
public class javaEx_ScannerClass{
	public static void main (String [] args){
		//variables
		Scanner userAnswer = new Scanner (System.in);
		int userIncomePassive;
		int userMonthlyRent;
		int differnceIncomeRent;
	
		
		//input
		System.out.println("Please enter your passive income in dollars: ");
		userIncomePassive = userAnswer.nextInt();
		
		System.out.println("\nPlease enter your monthly rent:  ");
		userMonthlyRent = userAnswer.nextInt();
		
		//processing
		differnceIncomeRent = userIncomePassive - userMonthlyRent;
		if (userIncomePassive > userMonthlyRent){
			System.out.println("\nYour finances are good!");
			System.out.println ("\nThe differnce between your monthly rent and passive income is: " + differnceIncomeRent);
		}else{
			System.out.println("\nYour finances need work");
		}
		
	
		//output
	}
			
}