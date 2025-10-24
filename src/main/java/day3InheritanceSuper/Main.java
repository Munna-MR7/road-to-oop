package day3InheritanceSuper;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to Neela Bank!");
        System.out.println(("Enter account type: \n1. Saving Account\n2. Loan Account"));
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println(("Enter account number: "));
        String accNum= sc.nextLine();
        System.out.println(("Enter initial amount: "));
        double initialAmount=sc.nextDouble();
        sc.nextLine();
        if(n==1){
            System.out.println(("Enter interest Rate: "));
            double interestRate=sc.nextDouble();
            sc.nextLine();
            BankAccount ac=new SavingAccount(accNum, initialAmount, interestRate);
            while(true){
                System.out.println("............Menu........ \n1. Deposit\n2. Withdraw\n 3.Show Balance\n4. Check Loan\n5. Exit\n");
                System.out.print("Enter your choice: ");
                int m=sc.nextInt();
                sc.nextLine();
//            BankAccount ac = new BankAccount();

                if(m==1){
                    System.out.println("Enter amount: ");
                    double amount= sc.nextDouble();
                    ac.deposit(amount);
                    System.out.println("Deposited: "+amount+"\n");

                } else if (m==2) {
                    System.out.println("Enter amount: ");
                    double amount= sc.nextDouble();
                    ac.withdraw(amount);
                    System.out.println("Withdraw Done: "+amount+"\n");
                }
                else if (m==3) {
                    ac.showBalance();
                }
                else if (m==4) {
                    System.out.println("Enter Loan Amount: ");
                    LoanAccount lac= new LoanAccount();
                    lac.checkLoanLimit(sc.nextDouble());
                } else if (m==5) {
                    System.out.println("Thank you!");
                    break;
                }
                else {
                    System.out.println("Enter Valid Number please!\n");
                }
            }
        }
        else if(n==2) {
            System.out.println(("Enter Loan Limit: "));
            double loanLimit=sc.nextDouble();
            sc.nextLine();
            BankAccount ac=new LoanAccount(accNum, initialAmount, loanLimit);
            while(true){
                System.out.println("............Menu........ \n1. Deposit\n2. Withdraw\n 3.Show Balance\n4. Check Loan\n5. Exit\n");
                System.out.print("Enter your choice: ");
                int m=sc.nextInt();
                sc.nextLine();
//            BankAccount ac = new BankAccount();

                if(m==1){
                    System.out.println("Enter amount: ");
                    double amount= sc.nextDouble();
                    ac.deposit(amount);
                    System.out.println("Deposited: "+amount+"\n");

                } else if (m==2) {
                    System.out.println("Enter amount: ");
                    double amount= sc.nextDouble();
                    ac.withdraw(amount);
                    System.out.println("Withdraw Done: "+amount+"\n");
                }
                else if (m==3) {
                    ac.showBalance();
                }
                else if (m==4) {
                    System.out.println("Enter Loan Amount: ");
//                    BankAccount lac= new LoanAccount();
                    ((LoanAccount) ac).checkLoanLimit(sc.nextDouble());
//                    double loanAmount= sc.nextDouble();
                    //((LoanAccount) ac).checkLoanLimit(loanAmount);
                } else if (m==5) {
                    System.out.println("Thank you!");
                    break;
                }
                else {
                    System.out.println("Enter Valid Number please!\n");
                }
            }
        }


    }
}
