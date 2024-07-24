import java.util.Scanner;
import java.util.Arrays; // Add this line to import the Arrays class

/**
 * P10
 */
public class P10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Call the function and print the result
        int n = sc.nextInt();
        int[] fibonacciSequence = generateFibonacci(n);
        System.out.println(Arrays.toString(fibonacciSequence));
        
    }

    // Function to generate Fibonacci sequence
    public static int[] generateFibonacci(int n) {
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        if (n > 1) {
            fibonacci[1] = 1;
            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
        return fibonacci;
    }

}