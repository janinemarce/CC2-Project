// MARCELINO, Fillian Janine G.
// CITCS-1E
// Create a program that will print out the nth number in the fibonacci sequence of these element: 3,5,7,13,2,3,9.
// The fibopnacci method must be recursive, and there should be another method for displaying elements
package arrayfib;
public class ArrayFib {
    public static void main(String[] args) {
        int [] array = {3,5,7,13,2,3,9};
        int [] array2 = {1,2,3,4,5};
         display(array);
    }
  
    static int calcu (int x){
            if(x<=1){
            return x;
        } else {
            return calcu(x-1) + calcu(x-2);
        }
    }
     
    static void display(int [] array){
       
          for (int i = 0; i < array.length; i++){
                  System.out.println("f(" + array[i] + ")=" + calcu(array[i]));
              }
    
    } 
    
} // end of class
