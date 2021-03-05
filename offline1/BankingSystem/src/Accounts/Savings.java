package Accounts;

public class Savings extends Accounts{
    public Savings() {
        setInterestRate((float) .1);
    }

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
        System.out.println(amount+"$ withdrawn; previous balance "+(balance+amount)+"$ current balance "+balance+"$");
    }

    @Override
    public void requestLoan(int amount) {
        if(amount> bank.getInternalFund()){
            System.out.println("Sorry! Bank has internal fund deficit");
            return;
        }
        if(amount> 10000){
            System.out.println("Sorry! Savings account maximum allowable loan amount is 10000");
            return;
        }
        System.out.println("Loan request successful, sent for approval");
        // add loan in the loans array in Bank
    }

}
