import java.util.Scanner;

public class Addition {
    
    public static int addition()
    {
        int a; 
        int b; 
        int result;
        //Capital letters for reference and Small letters for variable name.
                System.out.println("Enter First Number: ");
                Scanner A= new Scanner(System.in);
                 a = A.nextInt();

                System.out.println("Enter Second Number: ");
                Scanner B = new Scanner(System.in);
                b = B.nextInt();

                result = a + b; 

            A.close();
            B.close();

        return  result; 
    }
}
