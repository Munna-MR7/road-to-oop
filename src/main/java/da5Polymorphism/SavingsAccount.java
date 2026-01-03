package da5Polymorphism;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String AccNum, double amount){
        //parent class constructor called by super()
        super(AccNum, amount);
    }

    @Override
    void withdraw(double amount){
        if(getBalance()>=500 && getBalance()>=amount){
            double balance= getBalance();
            balance-=amount;
            setBalance(balance);
            System.out.println("Withdraw Successful tk "+ amount+"\n");
        }
        else throw new IllegalArgumentException("Transaction Failed!");

    }
}
