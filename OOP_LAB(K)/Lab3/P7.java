import java.util.ArrayList;
import java.util.Random;

public class P7 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = generateRandomArray(100);
        int secondHighest = findSecondHighest(numbers);
        int secondSmallest = findSecondSmallest(numbers);

        System.out.println("Second highest element: " + secondHighest);
        System.out.println("Second smallest element: " + secondSmallest);
    }

    public static ArrayList<Integer> generateRandomArray(int size) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt());
        }

        return numbers;
    }

    public static int findSecondHighest(ArrayList<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > max) {
                secondMax = max;
                max = number;
            } else if (number > secondMax && number < max) {
                secondMax = number;
            }
        }

        return secondMax;
    }

    public static int findSecondSmallest(ArrayList<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < min) {
                secondMin = min;
                min = number;
            } else if (number < secondMin && number > min) {
                secondMin = number;
            }
        }

        return secondMin;
    }
}
