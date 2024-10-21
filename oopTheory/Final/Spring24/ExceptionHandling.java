import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class ExceptionHandling {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        try{

            System.out.println("Enter array size: ");
            int n = input.nextInt();

            int[] myArray = new int[n];

            System.out.println("Enter array index:");
            int index = input.nextInt();

            System.out.println("Enter value to insert: ");
            int value = input.nextInt();

            myArray[index] = value;

            System.out.println("Value inserted successfully.");


        }catch(ArrayIndexOutOfBoundsException e){

            System.out.println(e);

        }
        catch(InputMismatchException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Exception Handling is amaizing.");
        }

    }
    
}
