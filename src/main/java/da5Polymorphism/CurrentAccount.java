package da5Polymorphism;

public class CurrentAccount extends BankAccount {
    public CurrentAccount(String AccNum, double amount){
        //parent class constructor called by super()
        super(AccNum, amount);
    }

    @Override
    void withdraw(double amount){
        if(getBalance()>=1000 && getBalance()>=amount){
            double balance= getBalance();
            balance-=amount;
            setBalance(balance);
            System.out.println("Withdraw Successfull tk "+ amount+"\n");
        }
        else throw new IllegalArgumentException("Transaction Failed!");

    }
}
