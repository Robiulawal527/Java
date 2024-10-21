import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

public class File {

    public static void main(String[] args) {
        int minValue = Integer.MAX_VALUE;

    try {

        BufferedReader reader = new BufferedReader(new FileReader(input.txt))

        String line;

        while ((line = reader.readLine()) != null) {

            try {
                int number = Integer.parseInt(line);

                if (number<minValue){
                    minValue = number;
                }
                
            }catch(NumberFormatException e){
                continue;
            }            
        }

        reader.close();


    BufferedWriter writer = new BufferedWriter(new FileWriter(output.txt));

    try {
        if (minValue != Integer.MAX_VALUE){
            writer.write("Minimum Value is : "+ minValue);
        }
        else{
            writer.write("No numbers found!");
        }
    }
    catch(NumberFormatException e){
        System.out.println(e.getMessage());
    }

    writer.close();

    System.out.println("File written done.");

    }catch(Exception e ){
        System.out.println(e.getMessage());
    } 

    }

}
