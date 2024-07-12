// Input: User's name
import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();
        System.out.println("Hello " + name + "!");
    }
}
// Output: Hello [name]!

