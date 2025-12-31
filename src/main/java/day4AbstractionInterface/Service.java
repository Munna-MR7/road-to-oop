package day4AbstractionInterface;

public class Service implements BankOperations{
//    BankAccount ac= new BankAccount() {
//        @Override
//        protected void withdraw(double amount) {
//
//        }
//    };

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
