//Calcultion of multiple numbers
class Main{
    public static void main(String[] args){
        double a = 9.5;
        double b = 4.5;
        double c = 2.5;
        double d = 3.5;
        //int e = 3;
        double f = 45.5;

        if (f != d) {
            System.out.println("Answer = " + (((a*b)-(c*d))/(f-d)));
        } else {
            System.out.println("Cannot divide by zero.");
        }
        
    }
}