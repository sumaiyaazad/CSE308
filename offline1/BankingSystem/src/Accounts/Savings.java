package Accounts;

public class Savings extends Accounts{
    public Savings() {
        setInterestRate((float) .1);
        setMaximumAllowableLoan( 10000);
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
}
