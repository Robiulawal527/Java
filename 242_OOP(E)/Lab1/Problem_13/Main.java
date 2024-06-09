package Problem_13;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        // Prompt the user to enter the exchange rate from USD to BDT
        String rateString = JOptionPane.showInputDialog(null, "Enter the exchange rate from USD to BDT");
        double rate = Double.parseDouble(rateString);

        // Prompt the user to choose the conversion direction
        String optionString = JOptionPane.showInputDialog(null, "Enter 0 to convert from USD to BDT and 1 to convert from BDT to USD");
        int option = Integer.parseInt(optionString);

        double inputAmount, outputAmount;
        String inputString, outputString;

        if (option == 0) {
            // Convert from USD to BDT
            inputString = JOptionPane.showInputDialog(null, "Enter the amount in USD");
            inputAmount = Double.parseDouble(inputString);
            outputAmount = inputAmount * rate;
            outputString = String.format("%.2f USD is equivalent to %.2f BDT", inputAmount, outputAmount);
        } else {
            // Convert from BDT to USD
            inputString = JOptionPane.showInputDialog(null, "Enter the amount in BDT");
            inputAmount = Double.parseDouble(inputString);
            outputAmount = inputAmount / rate;
            outputString = String.format("%.2f BDT is equivalent to %.2f USD", inputAmount, outputAmount);
        }

        // Display the result
        JOptionPane.showMessageDialog(null, outputString);
    }
}