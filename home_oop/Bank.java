package home_oop;

public class Bank {

    public static void main(String[] args) {
        Account[] accounts = new Account[2];
        accounts[0] = new SavingAccount(2, 0.25);
        accounts[1] = new CurrentAccount(23, 50);

        for(int i=0; i<accounts.length;i++) {
            if (accounts[i] instanceof SavingAccount) {
                // You must cast an Account to use any of the descendant's methods
                SavingAccount account = (SavingAccount) accounts[i];
                System.out.println(account.getInterest());
            } else { // it's a CheckingAccount

            }
        }
        


    }
}
