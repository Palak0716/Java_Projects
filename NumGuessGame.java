import java.util.*;
import java.util.Random;

public class NumGuessGame{
   public static void main(String[] args){
      generateRandom();
}// end main method

   public static void generateRandom(){
      // creating object of random class
      Random rand = new Random();

      //Generating a random number between 0 - 100
      int randomNum = rand.nextInt(101);

      //caling guess method
      guess(randomNum);
   }// end generateRandom method

   public static void guess(int randomNum){
      // Creating the object of Scanner
      Scanner sc = new Scanner(System.in);

      //Welcome message
      System.out.println("");
      System.out.println("Number Guessing Game");
      System.out.println("Guess the number between 1 - 100");
      int guess = sc.nextInt();
      System.out.println("");
      // input validation
      while(guess<1 || guess>100){
         System.out.println("Guess a number between 1 - 100");
         guess =sc.nextInt();
         System.out.println("");

      }
      // try again untill you guess the number
      int tries = 0;
      while(guess != randomNum){
         tries++;
         System.out.println("Wrong guess !");
         System.out.println("Guess Again");
         guess = sc.nextInt();
         System.out.println("");

          // input validation
         while(guess<1 || guess>100){
            System.out.println("Guess a number between 1 - 100");
            guess =sc.nextInt();
            System.out.println("");
         }
   }
   System.out.println("Correct Answer: You Won ! ");
   System.out.println("Wrong Tries:  " + tries); 
   System.out.println("");
   // Play Again or exit
   System.out.println("Press 1 to play again");
   System.out.println("press 0 to exit");
   int choice = sc.nextInt();

   if(choice==1){
      generateRandom();
   }
   else 
      return;
   
   }// end guess method
}// end class