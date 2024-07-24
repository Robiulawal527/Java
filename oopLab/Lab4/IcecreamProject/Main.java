package IcecreamProject;

public class Main {
    public static void main(String[] args) {
        Icecream I1 = new Icecream("Vanilla", "Igloo", 490);
        System.out.println(I1.toString());
        Icecream I2 = new Icecream("Vanilla", "Igloo", 280);
        System.out.println(I2.toString());
        System.out.println(I1.equals(I2));   
        System.out.println(I1.compareTo(I2));
    }
}
