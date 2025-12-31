package day4AbstractionInterface;

public interface BankOperations {
    double checkBalance(BankAccount account);
    void transfer(BankAccount account, double amount);
}

