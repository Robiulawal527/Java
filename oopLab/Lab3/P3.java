import java.util.Scanner;
public class P3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter Students: ");
        int students = sc.nextInt();

        int arr[] = new int[students];

        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks of student " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        sc.close();

        
    int best = arr[0];
    for (int i = 1; i < students; i++) {
        if (arr[i] > best) {
            best = arr[i];
        }
    }

    System.out.println("Grades:");
    for (int i = 0; i < students; i++) {
        int score = arr[i];
        if (score >= best - 10) {
            System.out.println("Student " + (i + 1) + ": A");
        } else if (score >= best - 20) {
            System.out.println("Student " + (i + 1) + ": B");
        } else if (score >= best - 30) {
            System.out.println("Student " + (i + 1) + ": C");
        } else if (score >= best - 40) {
            System.out.println("Student " + (i + 1) + ": D");
        } else {
            System.out.println("Student " + (i + 1) + ": F");
        }
    }
}
}