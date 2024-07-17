package OOP_LAB.Assignment_2;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator,int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public String toString(){
        return numerator + " / "+denominator;
    }

    public void add(Fraction fraction){
        this.numerator= this.numerator*fraction.denominator + fraction.numerator*this.denominator;
        this.denominator=this.denominator*fraction.denominator;
        simplify();
    }

    public void sub(Fraction fraction){
        this.numerator= this.numerator*fraction.denominator - fraction.numerator*this.denominator;
        this.denominator=this.denominator*fraction.denominator;
        simplify();
    }
    public void mult(Fraction fraction){
       this.numerator=this.numerator*fraction.numerator;
       this.denominator=this.denominator*fraction.denominator;
        simplify();
    }
    public void div(Fraction fraction){
        this.numerator=this.numerator*fraction.denominator;
        this.denominator=this.denominator*fraction.numerator;
        simplify();
    }
    private void simplify(){
        int gcd=gcd(numerator,denominator);
        numerator/=gcd;
        denominator/=gcd;
    }

    private int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}

