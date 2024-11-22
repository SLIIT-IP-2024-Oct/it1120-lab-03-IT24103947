import java.util.Scanner;

public class IT24103947Lab3Q4 {

   public static void main(String[] args) {

	Scanner scn=new Scanner(System.in);
		
	       double amount;
	       double newAmount;
	       double digit1,digit2,digit3,digit4,digit5;
	       
	       System.out.print("Enter a five-digit number:");
	       amount=scn.nextDouble();
	       
	       digit1=Math.floor(amount/10000);
	       newAmount=amount%10000;

	       digit2=newAmount/1000;
	       newAmount=newAmount%1000;

	       digit3=newAmount/100;
	       newAmount=newAmount%100;

	       digit4=newAmount/10;
	       newAmount=newAmount%10;

	       digit5=newAmount/1;
            
	       System.out.println(" ");   
	       System.out.print(" "+(int) digit1);
	       System.out.print(" "+(int) digit2);
	       System.out.print(" "+(int) digit3);
	       System.out.print(" "+(int) digit4);
	       System.out.print(" "+(int) digit5);
	     
	   scn.close();    
	       
		 		
	}

}
