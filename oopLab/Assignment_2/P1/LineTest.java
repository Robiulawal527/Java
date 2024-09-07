import java.util.Scanner;
public class LineTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Line[] lines = new Line[4];

        // Input values for four lines
        for (int i = 0; i < lines.length; i++) {
            System.out.println("Enter the x and y coordinates for the first point of line " + (i + 1) + ": ");
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            System.out.println("Enter the x and y coordinates for the second point of line " + (i + 1) + ": ");
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();

            lines[i] = new Line(x1, y1, x2, y2);
        }

        // Print lines and check if they intersect
        for (int i = 0; i < lines.length - 1; i++) {
            for (int j = i + 1; j < lines.length; j++) {
                System.out.println(lines[i]);
                System.out.println(lines[j]);
                System.out.println("Do these lines intersect? " + Line.isIntersecting(lines[i], lines[j]));
            }
        }
        
        scanner.close();
    }

}