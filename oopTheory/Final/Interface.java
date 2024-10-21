// Define the interface Inf1
interface Inf1 {
    void m1();
    void m2();
}

// Define the interface Inf2
interface Inf2 {
    void m3();
}

// Define the abstract class Abs
abstract class Abs {
    abstract void m4();
}

// Define the concrete class that implements Inf1, Inf2, and Abs
class Concrete extends Abs implements Inf1, Inf2 {
    @Override
    public void m1() {
        System.out.println("Method m1 from Inf1");
    }

    @Override
    public void m2() {
        System.out.println("Method m2 from Inf1");
    }

    @Override
    public void m3() {
        System.out.println("Method m3 from Inf2");
    }

    @Override
    public void m4() {
        System.out.println("Method m4 from Abs");
    }
}

// Main class to test the implementation
public class Interface {
    public static void main(String[] args) {
        Concrete obj = new Concrete();

        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
    }
}
