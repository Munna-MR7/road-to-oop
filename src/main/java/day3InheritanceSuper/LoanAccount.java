package day3InheritanceSuper;
class LoanAccount extends BankAccount {
    double loanLimit;
    LoanAccount(String accNum, double balance, double loanLimit){
        super(accNum, balance);
        this.loanLimit=loanLimit;
    }
    LoanAccount(){
        super();
    }
    void checkLoanLimit(double loanAmount){
        if(loanAmount>loanLimit){
            System.out.println("You are not eligible for loan!");
        }
        else
            System.out.println("You are eligible for loan!");

    }
}
