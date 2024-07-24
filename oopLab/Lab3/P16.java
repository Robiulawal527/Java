import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P16 {
    public static void main(String[] args) {
        // Generate random numbers between 1 and 99
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randomNum = (int) (Math.random() * 99) + 1;
            nums.add(randomNum);
        }

        // Remove duplicates using a Set
        Set<Integer> uniqueNums = new HashSet<>(nums);

        // Convert the Set back to a List
        List<Integer> result = new ArrayList<>(uniqueNums);

        // Print the result
        System.out.println("Input: " + nums);
        System.out.println("Output: " + result);
    }
}
