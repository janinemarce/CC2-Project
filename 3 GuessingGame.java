// MARCELINO, Fillian Janine G.
// CITCS-1E
// Create a guessing game that will allow user to guess a number from 1 to 1000
package guessinggame;
import java.util.Scanner;
public class GuessingGame {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a Number to be Guessed: ");
        System.out.println("***Range should be 1 to 1000***");
        int gnum = sc.nextInt();
        int counter=0;
      if (gnum>=1 && gnum<=1000) {
        do { 
             System.out.println("Guess the Number:");
             int num = sc.nextInt();      
               
            if (gnum==num) {
              System.out.println("Correct!");
              break;
            } else if (gnum%2==0) {
                  if (num>gnum) {
                      System.out.println("HINT: The Number is Even and Lower");
                  } else if (num<gnum) {
                      System.out.println("HINT: The Number is Even and Higher");
                  }
            } else if (gnum%2!=0) {
                  if (num>gnum) {
                      System.out.println("HINT: The Number is Odd and Lower");
                  } else if (num<gnum) {
                      System.out.println("HINT: The Number is Odd and Higher");
                  }
              } else {
                  System.out.println("Invalid Number! ");
              } // end of if
               counter++;
        
        } while (counter>0); // end of do while
      } else {
          System.out.println("Invalid");
      }  // end of if 
    } // end of main
} // end of class


