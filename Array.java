package array;
import java.util.Scanner;
public class Array {
	public static void main (String[] args) {

		Scanner sc = new Scanner (System.in);
		int a , b;
		int [] [] arrayholder = {};
		
	
		System.out.println("Input number of Rows:");
			arrayholder = new int [sc.nextInt()][0];
		
		for (a=0; a<arrayholder.length; a++) {
				System.out.println("Input number of columns for Row " + (a+1) + ":");
				arrayholder[a] = new int[sc.nextInt()];
			}
	
		for(a=0; a < arrayholder.length; a++) {
			for (b=0; b < arrayholder[a].length; b++) {
				System.out.println("Enter value for Row " + (a+1) + " and Column " + (b+1) + ":");
				arrayholder[a][b] = sc.nextInt();
			}
		}
		
		System.out.println("Array:");
		for (a = 0; a<arrayholder.length; a++) {
			for (b =0; b<arrayholder[a].length; b++) {
				System.out.print(arrayholder[a][b] + " ");
			}
			System.out.println();
		}
	
	}
}
