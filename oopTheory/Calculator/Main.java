
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {

            System.out.println("Menu--------------------------- \n 0.Exit \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n ");

            System.out.println("Please enter a choice: ");
            Scanner option = new Scanner(System.in);
            int x = option.nextInt();

            if (x == 0)
                break;

            else if (x == 1) {

                System.out.println(Addition.addition());

            }

            else if (x == 2) {

                System.out.println("Result: " + Subtraction.subtraction());

            } else if (x == 3) {

                System.out.println("Result: " + Multiplication.multiplication());

            } else if (x == 4) {

                System.out.println("Result: " + Division.division());

            } else {
                System.out.println("Please enter a valid choice, between 0 to 4.");
            }
            // End of conditions.

        }

        // End of while loop.

    }
}
