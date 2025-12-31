package day4AbstractionInterface;

public class SavingAccount extends BankAccount {
    public SavingAccount(String accountNumber, double amount) {
        super(accountNumber, amount);
    }

    @Override
    protected void withdraw(double amount) {
        if (balance - amount >= 500) {
            balance -= amount;
            System.out.println("Withdraw succesfull tk " + amount);
            System.out.println("New Balance is tk " + balance);
        }
        else
            System.out.println("Failed, Ballance is less than minimum.");
    }

}