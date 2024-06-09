package     Problem_8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int minute, second, kilometer;
        Scanner input = new Scanner(System.in);
        minute = input.nextInt();
        second = input.nextInt();
        kilometer = input.nextInt();

        input.close();

        double hour = minute / 60.0 + second / 3600.0;
        double mile = kilometer / 1.6;
        
        double milePerHour = mile / hour;

        System.out.println("Speed in miles per hour is = " + milePerHour);

    }
}