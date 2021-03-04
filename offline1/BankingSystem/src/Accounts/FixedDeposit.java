package Accounts;

public class FixedDeposit extends Accounts{

    @Override
    public void create(String accountName, int amount) {
        if(amount<100000){
           System.out.println("Sorry! Initial deposit amount of a fixed deposit account at least 100000$");
           return;
        }
        balance=amount;
        loan=0;
        name=accountName;
        year=0;
    }

    @Override
    public void deposit(int amount) {
        if(amount<50000){
            System.out.println("Sorry! Deposit amount of a fixed deposit account at least 50000$");
            return;
        }
        balance+=amount;
        System.out.println(amount+"$ deposited; current balance "+balance+"$");
    }

    @Override
    public void withdraw(int amount) {
        if(balance<amount){
            System.out.println("Sorry! Invalid transaction");
            return;
        }
        if(year<1){
            System.out.println("Sorry! Fixed deposit has not matured yet");
            return;
        }
        balance-=amount;
    }

    @Override
    public void requestLoan(int amount) {
        if(amount> 100000){
            System.out.println("Sorry! Fixed deposit account maximum allowable loan amount is 100000");
            return;
        }
        System.out.println("Loan request successful, sent for approval");
        // add loan in the loans array in Bank
    }

    @Override
    public void query(){
        balance=(float)(balance*.15-loan*.1);
        if(loan!=0){
            System.out.println("Current Balance "+balance+"$, loan "+loan+"$");
            return;
        }
        System.out.println("Current Balance "+balance+"$");
    }
}
