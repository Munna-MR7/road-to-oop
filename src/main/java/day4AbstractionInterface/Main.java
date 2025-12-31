package day4AbstractionInterface;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Account Type..................\n" + "1. Saving Account\n" + "2. Current Account" );
        
        int type = sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("Enter Acc No: ");
        String acNum = sc.nextLine();
        
        System.out.println("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();
        BankAccount account;
        Service service = new Service();


        if(type==1) {

            account = new SavingAccount(acNum, initialBalance);
            System.out.println("Welcome Saving Account Created!\n");

        }
        else if(type == 2) {
            account = new CurrentAccount(acNum, initialBalance);
            System.out.println("Welcome Current Account Created!\n");

        }
        else
        {
            System.out.println("Invalid Input.\n");
            return;
        }

        while (true) {
            System.out.println("1. Deposit...........\n" +
                    "2. Withdraw...............\n" +
                    "3. Check Balance............\n" +
                    "4. Transfer Amount........\n" + "5. Exit");

            int opt = sc.nextInt();
            sc.nextLine();
            if (opt == 1) {
                System.out.println("Enter deposit amount: ");
                account.deposit(sc.nextDouble());
            }
            else if (opt == 2) {
                account.withdraw(sc.nextDouble());

            }
            else if (opt == 3) {
                double amount = service.checkBalance(account);
                System.out.println("Your balance is: " + amount + "tk\n");

            } else if (opt == 4) {
                System.out.println("Enter Transfer amount: ");
                double amount = sc.nextDouble();
                sc.nextLine();
                service.transfer(account, amount);
            }
            else if(opt==5)
            {
                System.out.println("Thank You");
                return ;
            }

            else {
                System.out.println("Enter valid Number please.\n");
            }
        }
    }
}
