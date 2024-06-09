package Problem_7;

/**
 * Main
 */

 ///import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int minute = 45; 
        int second = 30;
        int kilometer = 14;

        double hour = minute / 60.0 + second / 3600.0;
        double mile = kilometer / 1.6;
        
        double milePerHour = mile / hour;
        
        System.out.println("Speed in miles per hour is = " + milePerHour);
        
    }
}
