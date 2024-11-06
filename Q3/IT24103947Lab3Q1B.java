import java.util.Scanner;

 public class IT24103947Lab3Q1B{

  public static void main(String[] args){

   Scanner scn = new Scanner(System.in);

       double kilograms;
       double priceOf1Kilogram;
       double discount=10.00/100;
       double totalAmount;

  System.out.print("Enter the price of 1kg of rice:");
  kilograms = scn.nextDouble();

  System.out.print("Enter the number of kilograms you want to buy:");
  priceOf1Kilogram = scn.nextDouble();

  totalAmount = (kilograms * priceOf1Kilogram)-(kilograms * priceOf1Kilogram * discount);
 
 System.out.println();
 System.out.print("The total amount with 10% discont is:" + totalAmount);

 scn.close();
 }

}