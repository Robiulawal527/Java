public class Withdraw {
     public static void withdraw(double amount){
        if (amount<Account.balance) {
            Account.balance -= amount;
        }else{
            System.out.println("Your Balance:  " + Account.balance);
        }
    }
}
