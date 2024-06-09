package Problem_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner mynum = new Scanner(System.in);
        System.out.println("Enter a number of minutes: ");
        int totalMinutes = mynum.nextInt();

        mynum.close();

        
        int minutesInYear = 365 * 24 * 60;
        int minutesInDay = 24 * 60;

        int years = totalMinutes / minutesInYear;
        int remainingMinutes = totalMinutes % minutesInYear;

        int days = remainingMinutes / minutesInDay;

        System.out.println(totalMinutes + " minutes is approximately " + years + " years and " + days + " days.");
    }
}