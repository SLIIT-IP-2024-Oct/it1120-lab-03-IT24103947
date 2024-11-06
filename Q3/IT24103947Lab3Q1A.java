import java.util.Scanner;

public class IT24103947Lab3Q1A{

	public static void main(String[] args) {
	 
	 Scanner scn=new Scanner(System.in);
	  
          //declare variables;
	
	  double kilograms;
	  double priceOf1Kilogram;
	  double totalAmount;
          	 
	  System.out.print("Enter the price of 1kg of rice:");
	  priceOf1Kilogram = scn.nextDouble();
	  
	  System.out.print("Enetr the number of kilograms you want to buy:");
	  kilograms = scn.nextDouble();
	  
	  totalAmount= kilograms * priceOf1Kilogram;
           
	  System.out.println();
	  System.out.println("The total amount is:" + totalAmount);
	  scn.close();
	
	}

}
