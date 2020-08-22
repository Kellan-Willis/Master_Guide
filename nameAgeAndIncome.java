

/*
1.  Name, age and annual income 

Write a program that declares the following:
*  A String variable named name 
*  An int variable named age 
*  a double variable nammed annualPay 

Store your age, name and desired annual income as literals in these variables.  The program should display values on the screen in a manner similar to the following;

My name is Joe Mahoney, my age is 26 and I hope to earn $100000.0 per year.

*/
public class nameAgeAndIncome{
	public static void main (String [] args){
		//variables
		String name;
		int age;
		double annaulPay;
		
		//input
		//processing 
		name = "Kellan Willis";
		age = 35;
		annaulPay = 100000;
		//output
		System.out.println(" My name is "+ name + ", my age is "+ age + " and I hope to earn $" + annaulPay + " per year.");
		
	}
	
}