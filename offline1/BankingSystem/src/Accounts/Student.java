package Accounts;

public class Student extends Accounts{
    public Student() {
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

    @Override
    public void requestLoan(int amount) {
        if(amount> bank.getInternalFund()){
            System.out.println("Sorry! Bank has internal fund deficit");
            return;
        }
        if(amount> 1000){
            System.out.println("Sorry! Student account maximum allowable loan amount is 1000");
            return;
        }
        System.out.println("Loan request successful, sent for approval");
        // add loan in the loans array in Bank
    }

    @Override
    public void query(){
        balance=(float)(balance*interestRate-loan*.1);
        if(loan!=0){
            System.out.println("Current Balance "+balance+"$, loan "+loan+"$");
            return;
        }
        System.out.println("Current Balance "+balance+"$");
    }
}
