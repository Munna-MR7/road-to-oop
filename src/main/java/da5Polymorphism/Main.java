package da5Polymorphism;
import javax.imageio.IIOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IIOException {
        Scanner scanner = new Scanner(System.in);
        //enum AccountType {SAVINGS, CURRENT}
        System.out.println("Enter Acc No: ");
        String acNum = scanner.nextLine();

        System.out.println("Enter Initial Balance: ");
        double initialBalance = scanner.nextDouble();
        BankAccount account;
        System.out.println("Enter Account Type..................\n" + "1. Saving Account\n" + "2. Current Account");
        int opt = scanner.nextInt();
        if (opt == 1) {
            //Upcasting
            account = new SavingsAccount(acNum, initialBalance);
        } else if (opt == 2) {
            account = new CurrentAccount(acNum, initialBalance);
        } else throw new IIOException("Invalid Input!");

        while (true) {
            System.out.println("1. Deposit...........\n" +
                    "2. Withdraw...............\n" +
                    "3. Check Balance" +
                    "4. Exit");

            int op = scanner.nextInt();
            scanner.nextLine();
            if (op == 1) {
                System.out.println("Enter Your Name: ");
                String name = scanner.nextLine();
                System.out.println("Enter amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine();

                // method overloading in compile time
                account.deposit(amount, name);
            } else if (op == 2) {
                System.out.println("Enter amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine();

                //method overriding in Runtime
                account.withdraw(amount);
            } else if (op==3) {
                double balance = account.getBalance();
                System.out.println("Your balance is tk "+ balance);
            } else if(op==4){
                System.out.println("Thank you!");
                return;
            }
            else throw new IIOException("Invalid Input!");
        }

    }

}
