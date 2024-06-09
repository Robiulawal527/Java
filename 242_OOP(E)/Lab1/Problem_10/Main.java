package Problem_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int x; 
       Scanner mynum = new Scanner(System.in);
        System.out.println("Enter a number: ");
        x = mynum.nextInt();
        mynum.close();
        System.out.println("You entered: " + x);


        if (x % 2 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (x % 3 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
    }
}
