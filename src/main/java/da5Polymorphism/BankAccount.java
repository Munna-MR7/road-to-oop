package da5Polymorphism;

public abstract class BankAccount {
    private String AccNum;
    private double balance;

    //Constructor
    public BankAccount(String AccNum, double initialBalance){
        this.AccNum=AccNum;
        this.balance=initialBalance;
    }
    //getter by achieving encapsulation
    double getBalance(){
        return balance;
    }
    //setter
    void setBalance(double amount){
        //Exception Handle
        if(amount<0) throw new IllegalArgumentException("Amount can't be negative");
        balance=amount;
    }

    //Compile time polymorphism by method overloading
    void deposit(double amount){
        balance+=amount;
    }
    void deposit(double amount, String msg){
        balance+=amount;
        System.out.println("Deposit Successful tk  "+ amount + "By  "+msg +"\n");
    }
    abstract void withdraw(double amount);

}
