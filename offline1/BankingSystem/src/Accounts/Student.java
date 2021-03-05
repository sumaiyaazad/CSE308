package Accounts;

public class Student extends Accounts{
    public Student() {
        setInterestRate((float) .05);
        setMaximumAllowableLoan( 1000);
        setType("Student");
    }

    @Override
    public void withdraw(int amount) {
        if(balance<amount){
            System.out.println("Sorry! Invalid transaction");
            return;
        }
        if(amount>10000){
            System.out.println("Sorry! Student is unable to withdraw more than 10000$ in one transaction.");
            return;
        }
        balance-=amount;
        System.out.println(amount+"$ withdrawn; previous balance "+(balance+amount)+"$ current balance "+balance+"$");
    }
}
