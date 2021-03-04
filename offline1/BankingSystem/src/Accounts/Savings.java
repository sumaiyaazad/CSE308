package Accounts;

public class Savings extends Accounts{

    @Override
    public void withdraw(int amount) {
        if(balance<amount){
            System.out.println("Sorry! Invalid transaction");
            return;
        }
        if(balance-amount<1000){
            System.out.println("Sorry! Savings account must always have 1000$ balance at least");
            return;
        }
        balance-=amount;
    }

    @Override
    public void requestLoan(int amount) {
        if(amount> 10000){
            System.out.println("Sorry! Savings account maximum allowable loan amount is 10000");
            return;
        }
        System.out.println("Loan request successful, sent for approval");
        // add loan in the loans array in Bank
    }

    @Override
    public void query(){
        balance= (float) (balance*.1-loan*.1);
        if(loan!=0){
            System.out.println("Current Balance "+balance+"$, loan "+loan+"$");
            return;
        }
        System.out.println("Current Balance "+balance+"$");
    }
}
