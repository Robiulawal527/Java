
public class Account {
    String name; 
    String id; 
    static double balance;

    public Account(String name, String id, double balance) {
        super();
        //uses of this
        this.name = name;
        this.id = id;
        Account.balance = balance;
    }

    public static void account(){
        System.out.println("Welcome to account.");

        Account ref = new Account("Robiul Awal", "1122", 5250.0);

        System.out.println("Name: " + ref.name);
        System.out.println("ID: " + ref.id);
        System.out.println("Balance: " + Account.balance);

    }


}
