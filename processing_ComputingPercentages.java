/*

The East Coast sales division of a company generates 62 percent of total sales.  Based on that percentage,
write a program that will predict how much the Eastcoast Division will generate if the company has $4.6 million 
in sales this year.

*/

public class processing_ComputingPercentages{
	public static void main (String [] args){
		//variables 
		double percentageGenerated;
		double totalGeneratedForYear;
		double eastCoastAnnualSalesForThisYear;
		
		//input 
		//processing 
		percentageGenerated = 0.62;
		totalGeneratedForYear = 4600000;
		eastCoastAnnualSalesForThisYear = percentageGenerated * totalGeneratedForYear;
		
		
		//output 
		System.out.println (" This year, the EastCoast Division generated: " + eastCoastAnnualSalesForThisYear);
		
	}
}