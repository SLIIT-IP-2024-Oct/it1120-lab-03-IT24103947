import java.util.Scanner;
 
 public class IT24103947Lab3Q3 {

  public static void main(String[] args) {
 
   Scanner scn=new Scanner(System.in);

    double numberOf5000s,numberOf1000s,numberOf500s,numberOf200s,numberOf100s,numberOf50s,numberOf20s,numberOf10s,numberOf05s,numberOf02s,numberOf01s;;
    double rupeeAmount;
    double newAmount;

     System.out.print("Enter the Rupee amount:");
     rupeeAmount=scn.nextDouble();


      numberOf5000s=Math.floor(rupeeAmount/5000);
      newAmount=rupeeAmount%5000;
      numberOf1000s=Math.floor(newAmount/1000);
      newAmount=newAmount%1000;
      numberOf500s=Math.floor(newAmount/500);
      newAmount=newAmount%500;
      numberOf200s=Math.floor(newAmount/200);
      newAmount=newAmount%200;
      numberOf100s=Math.floor(newAmount/100);
      newAmount=newAmount%100;
      numberOf50s=Math.floor(newAmount/50);
      newAmount=newAmount%50;
      numberOf20s=Math.floor(newAmount/20);
      newAmount=newAmount%20;
      numberOf10s=Math.floor(newAmount/10);
      newAmount=newAmount%10;
      numberOf05s=Math.floor(newAmount/5);
      newAmount=newAmount%5;
      numberOf02s=Math.floor(newAmount/2);
      newAmount=newAmount%2;
      numberOf01s=Math.floor(newAmount/1);
 
   System.out.println(""); 
   System.out.println("5000 Notes - " +(int) numberOf5000s);
   System.out.println("1000 Notes - " +(int) numberOf1000s);
   System.out.println("500 Notes - " +(int) numberOf500s);
   System.out.println("200 Notes - " +(int) numberOf200s);
   System.out.println("100 Notes - " +(int) numberOf100s);
   System.out.println("50 Notes - " +(int) numberOf50s);
   System.out.println("20 Notes - " +(int) numberOf20s);
   System.out.println("10 Notes - " +(int) numberOf10s);
   System.out.println("05 Coins - " +(int) numberOf05s);
   System.out.println("02 Coins - " +(int) numberOf02s);
   System.out.println("01 Coins - " +(int) numberOf01s);
  scn.close();

 }

}