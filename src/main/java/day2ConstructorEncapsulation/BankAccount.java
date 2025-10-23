package day2ConstructorEncapsulation;

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;



    //Parameterized constructor
    public BankAccount(String accountHolder, String accountNumber, double initialBalance){
        this.accountHolder=accountHolder;
        this.accountNumber= accountNumber;
        this.balance= initialBalance;
    }
    //default constructor
    public BankAccount(){
        if (balance<0){
            balance=0;
        }
    }

    //Getter to implement encapsulation
    public double getBalance() {
        return balance;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    //setter
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
        else System.out.println("Deposit Error");
    }
    public void withdraw(double amount){
        if(amount>0 && balance>=amount){
            balance-=amount;
        }
        else System.out.println("Withdraw Error");
    }

    void showBalance(){
        System.out.println("Name: "+getAccountHolder());
        System.out.println("Account Number: "+getAccountNumber());
        System.out.println("Balance: "+getBalance()+"\n");
    }
}
