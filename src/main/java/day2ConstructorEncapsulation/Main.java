package day2ConstructorEncapsulation;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to Java Bank!");
        System.out.println("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Enter account Number: ");
        String accountNumber=sc.nextLine();

        System.out.println("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        BankAccount ac= new BankAccount(name, accountNumber, initialBalance);

        while(true){
            System.out.println("............Menu........ \n1. Deposit\n2. Withdraw\n 3.Show Balance\n4. Exit\n");
            System.out.print("Enter your choice: ");
            int n=sc.nextInt();
            if(n==1){
                System.out.println("Enter amount: ");
                double amount= sc.nextDouble();
                ac.deposit(amount);
                System.out.println("Deposited: "+amount+"\n");

            } else if (n==2) {
                System.out.println("Enter amount: ");
                double amount= sc.nextDouble();
                ac.withdraw(amount);
                System.out.println("Withdraw Done: "+amount+"\n");
            }
            else if (n==3) {
                ac.showBalance();
            }
            else if (n==4) {
                System.out.println("Thank you!");
                break;
            }
            else {
                System.out.println("Enter Valid Number please!\n");
            }
        }

    }
}
