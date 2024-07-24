package oopTheory;

import java.util.Scanner;

public class menuTest {
    public static void main(String[] args) {
        
        
        while (true) {

            System.out.println("Menu--------------------------- \n 0.Exit \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n ");
            
           Scanner option = new Scanner(System.in);
           int x = option.nextInt();
            
            if (x==0)
                break;

            else if (x==1) {
                System.out.println("x equals 1.");

            }

            else if (x==2) {
                System.out.println("x equals Two");
            }
            else if(x==3){

            }
            else if(x==4){

            }
            else{
                System.out.println("Please Enter Valid choice. (0 to 4)");
            }
        }
    }
}
