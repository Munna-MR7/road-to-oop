package day4AbstractionInterface;

public class BankService implements BankOperations{

    @Override
    public void transfer(BankAccount account, double amount){
        if(account.getBalance()>=amount)
        {
            account.withdraw(amount);
            System.out.println("successfully Transferred tk "+amount);

        }
        else{
            System.out.println("Transferred Failed tk "+amount);
        }

    }
    @Override
    public  double checkBalance( BankAccount account){

        return account.getBalance();
    }
}
