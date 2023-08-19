// develop the calculator in java
import java.util.*;
class Calculator{
   public static void main(String[] args){
      // define Variable
      int n1, n2, rem, cal, op;
      // Scanner object
      Scanner sc = new Scanner(System.in);
      // input of numbers
      System.out.println("Enter Two Numbers");
      System.out.println("Enter First Number: ");
      n1 = sc.nextInt();
      System.out.println("Enter Second Number: ");
      n2 = sc.nextInt();
      // choice for the opearation
      System.out.println("Select Operation: ");
      System.out.println("Press 1 for Addition:");
      System.out.println("Press 2 for Subtraction: ");
      System.out.println("Press 3 for Multiplication: ");
      System.out.println("Press 4 for Division: ");
      System.out.println("---------------------------------------");
      System.out.println("Enter your choice: ");
      op = sc.nextInt();
      System.out.println("------------------------------------------");
      if(op==1){
         cal = n1 + n2;
         System.out.println("The Addition of Two Numbers is : " + cal);
      }
      else if (op==2){
         cal = n1 - n2;
         System.out.println("The Difference of Two Numbers is : " + cal);
      }
      else if (op==3){
         cal = n1 * n2;
         System.out.println("The Product of Two Numbers is : " + cal);
      }
      else if (op==4){
         cal = n1 / n2;
         System.out.println("The Dividion of Two Numbers is : " + cal);
         rem = n1 % n2;
         System.out.println("The Reminder is :" + rem);
      }
      else{
         System.out.println("Invalid Number Operartion not found !");
      }
   }
}