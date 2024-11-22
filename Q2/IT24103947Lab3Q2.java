import java.util.Scanner;

 public class IT24103947Lab3Q2 {

  public static void main(String[] args) {
  
   Scanner scn=new Scanner(System.in);

   double monthlySalary;
   double OTHours;
   double OTHourlyRate;
   double totalSalary;
   double OTAmount;


    System.out.print("Enter the monthly salary: ");
    monthlySalary = scn.nextDouble();

    System.out.print("Enetr the number of OT hours: ");
    OTHours = scn.nextDouble();

    System.out.print("Enter the OT hourly rate: ");
    OTHourlyRate = scn.nextDouble();

  //calculate the salary including OT;
    
    OTAmount=OTHours*OTHourlyRate;
    totalSalary=monthlySalary+OTAmount;

  System.out.println();
  System.out.println("The total salary including OT is: " + totalSalary);
  scn.close();

  }

} 