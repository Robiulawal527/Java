import java.util.Scanner;

public class P15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input from user
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the number of steps to rotate the array: ");
        int k = scanner.nextInt();
        
        // Rotate the array
        rotateArray(nums, k);
        
        // Print the rotated array
        System.out.println("Rotated array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
    
    public static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k is greater than n
        
        reverse(nums, 0, n - 1); // Reverse the whole array
        reverse(nums, 0, k - 1); // Reverse the first k elements
        reverse(nums, k, n - 1); // Reverse the remaining elements
    }
    
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}