package day2ConstructorEncapsulation;

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;



    //Parameterized constructor
    BankAccount(String accountHolder, String accountNumber, double initialBalance){
        this.accountHolder=accountHolder;
        this.accountNumber= accountNumber;
        this.balance= initialBalance;
    }
    //default constructor
    BankAccount(){
        if (balance<0){
            balance=0;
        }
    }

    //Getter to implement encapsulation
    double getBalance() {
        return balance;
    }
    String getAccountHolder(){
        return accountHolder;
    }
    String getAccountNumber(){
        return accountNumber;
    }
    //setter
    void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
        else System.out.println("Deposit Error");
    }
    void withdraw(double amount){
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
