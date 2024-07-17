package OOP_LAB.Assignment_2;

public class TestFraction {

    public static void main(String[] args) {
        Fraction f1=new Fraction(1,4);
        Fraction f2=new Fraction(3,5);
   
           System.out.println("Fraction 1: "+f1);
           System.out.println("Fraction 2: "+f2);
   
          f1.add(f2);
           System.out.println("Addition: "+f1);
   
           f1= new Fraction(1,4);
           f1.sub(f2);
           System.out.println("Substraction: "+f1);
   
           f1= new Fraction(1,4);
           f1.mult(f2);
           System.out.println("Multiplication: "+f1);
   
           f1= new Fraction(1,4);
           f1.div(f2);
           System.out.println("Division: "+f1);
   
       }
    
}

