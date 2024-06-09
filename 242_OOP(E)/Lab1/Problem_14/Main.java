package Problem_14;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Prompt the user to enter the center of the circle
        String pString = JOptionPane.showInputDialog("Enter the x-coordinate of the center of the circle");
        double p = Double.parseDouble(pString);
        String qString = JOptionPane.showInputDialog("Enter the y-coordinate of the center of the circle");
        double q = Double.parseDouble(qString);

        // Prompt the user to enter the radius of the circle
        String rString = JOptionPane.showInputDialog("Enter the radius of the circle");
        double r = Double.parseDouble(rString);

        // Prompt the user to enter a point
        String xString = JOptionPane.showInputDialog("Enter the x-coordinate of the point");
        double x = Double.parseDouble(xString);
        String yString = JOptionPane.showInputDialog("Enter the y-coordinate of the point");
        double y = Double.parseDouble(yString);

        // Calculate the distance from the point to the center of the circle
        double distance = Math.sqrt(Math.pow(x - p, 2) + Math.pow(y - q, 2));

        // Check whether the point is within the circle
        String outputString;
        if (distance <= r) {
            outputString = "The point (" + x + ", " + y + ") is within the circle centered at (" + p + ", " + q + ") with radius " + r;
        } else {
            outputString = "The point (" + x + ", " + y + ") is outside the circle centered at (" + p + ", " + q + ") with radius " + r;
        }

        // Display the result
        JOptionPane.showMessageDialog(null, outputString);
    }
}
