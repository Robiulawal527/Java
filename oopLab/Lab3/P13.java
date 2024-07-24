import java.util.*;
public class P13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        scanner.close();

        int[] result = twoSum(nums, target);
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the complement of each number
        Map<Integer, Integer> complementMap = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (complementMap.containsKey(complement)) {
                // Return the indices of the two numbers
                return new int[]{complementMap.get(complement), i};
            }

            // Add the current number and its index to the map
            complementMap.put(nums[i], i);
        }

        // No solution found, return an empty array
        return new int[0];
    }
}
