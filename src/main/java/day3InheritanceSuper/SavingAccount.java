package day3InheritanceSuper;

class SavingAccount extends BankAccount {

    double interestRate;

    //child constructor
    SavingAccount(String accNum, double initialBalance, double interestRate) {
        super(accNum, initialBalance);//call parent constructor
        this.interestRate = interestRate;
    }
    SavingAccount(){
        super();
    }

    void addInterest() {
        setBalance((getBalance()*0.1));
    }
}