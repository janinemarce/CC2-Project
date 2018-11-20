// MARCELINO, Fillian Janine G.
// CITCS-1E
// Create a simple calculator program
package calculator;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        double first = reader.nextDouble();
        double second = reader.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, %) or (add, subtract, multiply, divide, modulo): ");
        Scanner reader2 = new Scanner(System.in);
        String operator = reader2.nextLine();
        double result;

        switch(operator)
        {
            case "+":
            case "add":
                result = first + second;
                break;  
            case "-":
            case "subtract":
                result = first - second;
                break;
            case "*":
            case "multiply":
                result = first * second;
                break;
            case "/":
            case "divide":
                result = first / second;
                break;
            case "%":
            case "modulo":
                result = first % second;
                break;
                
            default:
                System.out.println("Error! Operator Entered Is Invalid");
                return;
        }
        System.out.println(first+" "+operator+" "+second+" = "+result);
    
    }
}
