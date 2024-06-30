package Problem_6;

/**
 * Main
 */

 import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double radius; 
        System.out.println("Enter the radius of the circle: ");
        Scanner input = new Scanner(System.in);
        radius = input.nextDouble();
        input.close();
        double perimeter = 2 * Math.PI * radius;
        
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

    }
}