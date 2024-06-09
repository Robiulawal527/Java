package Problem_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double celcius;

        Scanner input = new Scanner(System.in);

        input.close();

        System.out.println("Enter temperature in Celcius: ");
        celcius = input.nextDouble();

        double fahrenheit = celcius * 9 / 5 + 32;

        System.out.println("Temperature in Fahrenheit is = " + fahrenheit);


    }
}

