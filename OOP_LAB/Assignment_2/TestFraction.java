public class TestFraction {
    /**
     * this main method creates two Fraction objects, performs arithmetic operations on them,
     * and prints the results.
     */
    public static void main(String[] args) {
     Fraction f1=new Fraction(1,4);
     Fraction f2=new Fraction(3,5);

        System.out.println("Fraction 1: "+f1);
        System.out.println("Fraction 2: "+f2);

        f1.add(f2);
        System.out.println("The Addition: "+f1);

        f1= new Fraction(1,4);
        f1.sub(f2);
        System.out.println("The Substraction: "+f1);
        
        f1= new Fraction(1,4);
        f1.mult(f2);
        System.out.println("The Multiplication: "+f1);

        f1= new Fraction(1,4);
        f1.div(f2);
        System.out.println("The Division: "+f1);

    }
}
