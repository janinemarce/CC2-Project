// MARCELINO, Fillian Janine G.
// CITCS-1E
// Create a program displays the fibonacci sequence in tabular form
package fibonacci;
import java.util.Scanner;
public class Fibonacci {
    
    public static void main (String[]args){
        userinput();
    }
  
    static int calcu (int x){
        if(x<=1){
            return x;
        } else {
            return calcu(x-1) + calcu(x-2);
        }
    }
  
    static void userinput(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter A Value:");
        int num = sc.nextInt();
        
            for (int counter = 0 ; counter <= num; counter++){
                System.out.print("f(" + counter + ")\t");
            } 
            System.out.println();
            for (int a = 0; a<=num; a++) {
                for (int b=0; b<=a; b++) {
                    System.out.print(calcu(b) + "\t");
                }
                System.out.println();
            }
    }
}
        

