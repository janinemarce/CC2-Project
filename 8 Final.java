package pkgfinal;
import java.util.Scanner;
public class Final {
    
    public static Scanner sc = new Scanner (System.in);
    public static void main (String[]args){
           input();
    }

    static void input(){
  
        System.out.print("What do you want to get? Factorial or Fibonacci? ");
        String answer = sc.nextLine(); 
        if (!"factorial".equals(answer) && !"fibonacci".equals(answer)){
            input();
        }
        arrayinput(answer);
    }
  
    static void arrayinput (String answer){
        switch (answer) {
            case "fibonacci":
            case "factorial": 
            System.out.print("Enter the size of the array: ");
            int arrayholder[] = new int [sc.nextInt()];
       
            System.out.print("Enter element/s of the array: ");
                       for (int a=0; a<arrayholder.length; a++) {
                       arrayholder[a] = sc.nextInt();  
        }
                userinput(answer,arrayholder);
                break;
    }  
    }//end of array input
    
    static int fibcalcu (int x){
            if(x<=1){
            return x;
        } else {
            return fibcalcu(x-1) + fibcalcu(x-2);
        }
    }//end of fibcalcu
    
    static int factcalcu (int x){
        if (x<=1){
            return 1;
        } else {
            return x*factcalcu(x-1);
        }
    }//end of factcalcu
            
      
     static void userinput(String answer, int[]arrayholder){
         
          if (answer.equals("factorial")){
              for (int i = 0; i < arrayholder.length; i++){
                  System.out.println("f(" + arrayholder[i] + ")=" + factcalcu(arrayholder[i]));
              }
              
          } else if (answer.equals("fibonacci")) {
               for (int i = 0; i < arrayholder.length; i++){
                  System.out.println("f(" + arrayholder[i] + ")=" + fibcalcu(arrayholder[i]));
              }          
          } else {
              input();
          }
              
       
     } // end of userinput
}// end of class
