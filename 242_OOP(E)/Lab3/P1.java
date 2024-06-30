/**
 * 1
 */
import java.util.Scanner;
public class P1 {

    public static void main(String[] args) {
        System.out.println("Enter 10 inputs: ");  
        
        
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter input " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int positive = 0;
        int negative = 0;

        for (int i = 0; i < 10; i++) {
            if(arr[i]>0){
                positive++;
            }
            else if(arr[i]<0){
                negative++;
            }
        }

        System.out.println("Number of positive inputs: " + positive);
        System.out.println("Number of negative inputs: " + negative);

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of the inputs: " + sum);

        int average = sum / 10;
        System.out.println("Average of the inputs: " + average);


    }

}