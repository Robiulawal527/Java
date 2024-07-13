import java.util.Scanner;
/**
 * P4
 */
public class P4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 1 and 100: ");

        int arr[] = new int[100];

        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            arr[num]++;
        }

       

    }

    
    public static int occurrence(int arr[], int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }
    
    
}