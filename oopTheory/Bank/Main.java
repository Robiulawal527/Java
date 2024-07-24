import java.util.Scanner;

public class Main{
    public void main(String[] args) {

        Account.account();

        System.out.println("Enter amount to deposit: ");
        double amount;
        Scanner sc = new Scanner(System.in);
        amount = sc.nextDouble();
        sc.close();

        Deposit.deposit(amount);

        System.out.println("Enter amount to Withdraw: ");
        double amount2;
        Scanner sc2 = new Scanner(System.in);
        amount2 = sc2.nextDouble();
        sc2.close();

        Withdraw.withdraw(amount2);

    }
}