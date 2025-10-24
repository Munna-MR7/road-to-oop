package day3InheritanceSuper;

class BankAccount {
    private String accNum;
    private double balance;
    BankAccount(String accNum, double initialBalance){
        this.accNum=accNum;
        this.balance=initialBalance;
    }
    BankAccount(){
    }

    void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    void setBalance(double balance) {
        this.balance += balance;
    }

    String getAccNum() {
        return accNum;
    }

    double getBalance() {
        return balance;
    }
    void deposit(double amount){
         balance+=amount;
    }
    void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
        }
    }
    void showBalance(){
        System.out.println("Account Number: "+getAccNum()+"\nBalance is: "+ getBalance());
    }
}
