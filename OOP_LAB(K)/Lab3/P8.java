import java.util.*;

public class P8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Create arrays to store student names and scores
        String[] names = new String[numStudents];
        int[] scores = new int[numStudents];

        // Prompt the user to enter the students' names and scores
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student name: ");
            names[i] = input.next();
            System.out.print("Enter student score: ");
            scores[i] = input.nextInt();
        }

        // Sort the scores in descending order
        for (int i = 0; i < numStudents - 1; i++) {
            for (int j = i + 1; j < numStudents; j++) {
                if (scores[i] < scores[j]) {
                    // Swap scores
                    int tempScore = scores[i];
                    scores[i] = scores[j];
                    scores[j] = tempScore;

                    // Swap names
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }

        // Print student names in decreasing order of their scores
        System.out.println("Student names in decreasing order of their scores:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println(names[i]);
        }
    }
}
