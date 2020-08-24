/*  
input_UsingScanner

Write a program that will ask the user to enter the amount of a purchase.  The program should then compute the state and county 
sales tax.  Assume the state sales tax is 4 percent and the county sales tax is 2 percent.  The program should display the amount of the purchase, 
the state sales tax, the county tax, the total sales tax, and the total of the sale (which is the sum of the amount of the purchase plus the total sales tax).

Notes:  For using the Scanner class for user input:
1) Import the Scanner class through < import java.util.Scanner; > 
2) Declare the scanner variable through < Scanner scanner = new Scanner (System.in); > 
3) Ask for the user input through:
	<  System.out.print("Please enter the purchase amount: " ); >
	<  "purchasePrice = scanner.nextDouble();  >


*/
import java.util.Scanner;
public class input_UsingScanner{
	public static void main (String [] args){
		//variables
		double purchasePrice;
		double stateTaxRate;
		double countyTaxRate;
		double stateTaxOnPurchase;
		double countyTaxOnPurchase;
		double totalPrice;
		
		Scanner scanner = new Scanner (System.in);
		
		
		//input
		System.out.println ("Please enter the purchase amount: ");
		purchasePrice = scanner.nextDouble();
		
		//processing
		stateTaxRate = .04;
		countyTaxRate = .02;
		stateTaxOnPurchase = purchasePrice * stateTaxRate;
		countyTaxOnPurchase = purchasePrice * countyTaxRate;
		totalPrice = purchasePrice + stateTaxOnPurchase + countyTaxOnPurchase;
		
		//output
		System.out.println ( "The amount of the purchase is: " + totalPrice);
	}
}

