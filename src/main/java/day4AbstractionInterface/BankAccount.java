package day4AbstractionInterface;

public abstract class BankAccount {

     protected String accountNumber;
     protected double balance;

     //constructor
    public BankAccount(String accountNumber, double initialAmount) {
        this.accountNumber = accountNumber;
        this.balance = initialAmount;
    }

    //implemented method
     public void deposit(double amount)
     {
        this.balance += amount;
         System.out.println("Deposit succesfull tk " + amount);
         System.out.println("New Balance is tk " + balance);
    }

    //getter
    public double getBalance(){
        return balance;
    }

    //abstract method
    abstract void withdraw(double amount);

}