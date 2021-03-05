package Accounts;

public class FixedDeposit extends Accounts{
    public FixedDeposit() {
    }

    @Override
    public int create(String accountName, int amount) {
        if(amount<100000){
           System.out.println("Sorry! Initial deposit amount of a fixed deposit account at least 100000$");
           return 0;
        }
        balance=amount;
        loan=0;
        name=accountName;
        year=0;
        System.out.println("Student account for "+name+" Created; initial balance "+balance+"$");
        return 1;
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
        System.out.println(amount+"$ withdrawn; previous balance "+(balance+amount)+"$ current balance "+balance+"$");
    }

    @Override
    public void requestLoan(int amount) {
        if(amount> bank.getInternalFund()){
            System.out.println("Sorry! Bank has internal fund deficit");
            return;
        }
        if(amount> 100000){
            System.out.println("Sorry! Fixed deposit account maximum allowable loan amount is 100000");
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
