// MARCELINO, Fillian Janine G.
// CITCS-1E
// Create a program that sorts out the odds and even of an array in tabular form
package oddeventable;
public class OddEvenTable { // start of class
 public static void main(String[] args) { // start of main
        //variable array declaration
    

        int nums[] = {3, 9, 15, 20, 65, 23, 18, 4, 2, 14, 21, 22, 12}, counterEven = 0, counterOdd = 0, maxnum=0;
        int odd[];
        int even[];

        //display of array
        System.out.print("Array: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        //counter for number of odd and even
        for (int counter = 0; counter < nums.length; counter++) {
            switch (nums[counter] % 2) {
                case 1:
                    counterOdd++;
                    break;
                default:
                    counterEven++;
                    break;
            }
        }
        // setting max number
        if (counterOdd > counterEven) {
            maxnum = counterOdd;
        } else if (counterEven > counterOdd) {
            maxnum = counterEven;
        }
        odd = new int[maxnum];
        even = new int[maxnum];

        // sorting of odd and even 
        for (int counterf = 0, j = 0, k = 0; counterf < nums.length; counterf++) {
            switch (nums[counterf] % 2) {
                case 1:
                    odd[j] = nums[counterf];
                    j++;
                    break;
                default:
                    even[k] = nums[counterf];
                    k++;
                    break;
            }
        }

        //displaying of odd and even
        System.out.println("\n");
        System.out.println("Odd\tEven");
        for (int counterd = 0; counterd < maxnum; counterd++) {
            if (odd[counterd] == 0) {
                System.out.println("n/a\t" + even[counterd]);
            } else if (even[counterd] == 0) {
                System.out.println(odd[counterd] + "\tn/a");
            } else {
                System.out.println(odd[counterd] + "\t" + even[counterd]);
            }
        }
     
    } // end of main 
} // end of class
    
    

