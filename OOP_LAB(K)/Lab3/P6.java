import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ten numbers:");

        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();

            if (isDistinct(numbers, count, number)) {
                numbers[count] = number;
                count++;
            }
        }

        System.out.println("Number of distinct numbers: " + count);
        System.out.print("Distinct numbers: ");

        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static boolean isDistinct(int[] numbers, int count, int number) {
        for (int i = 0; i < count; i++) {
            if (numbers[i] == number) {
                return false;
            }
        }
        return true;
    }
}
