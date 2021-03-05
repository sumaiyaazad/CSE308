package Accounts;

import Bank.Bank;

public abstract class Accounts {
    public float balance;

    public Bank bank;

    public float interestRate;

    public int loan;

    public int maximumAllowableLoan;

    public String name;

    public int year;

    Accounts(){
        bank=new Bank();
    }

    public float getBalance() {
        return (float)(balance+balance*interestRate*year-loan*.1*year);
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public int getLoan() {
        return loan;
    }

    public void setLoan(int loan) {
        this.loan = loan;
    }

    public int getMaximumAllowableLoan() {
        return maximumAllowableLoan;
    }

    public void setMaximumAllowableLoan(int maximumAllowableLoan) {
        this.maximumAllowableLoan = maximumAllowableLoan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int create(String accountName, int amount){
        balance=amount;
        loan=0;
        name=accountName;
        year=0;
        System.out.println("Student account for "+name+" Created; initial balance "+balance+"$");
        return 1;
    };

    public void deposit(int amount){
        balance+=amount;
        System.out.println(amount+"$ deposited; current balance "+balance+"$");
    };

    public abstract void withdraw(int amount);

    public void requestLoan(int amount){
        if(amount> bank.getInternalFund()){
            System.out.println("Sorry! Bank has internal fund deficit");
            return;
        }
        if(amount> getMaximumAllowableLoan()){
            System.out.println("Sorry! Maximum allowable loan amount for this account  is "+getMaximumAllowableLoan()+"$");
            return;
        }
        System.out.println("Loan request successful, sent for approval");
        // add loan in the loans array in Bank
    };

    public void query(){
        if(loan!=0){
            System.out.println("Current Balance "+getBalance()+"$, loan "+loan+"$");
            return;
        }
        System.out.println("Current Balance "+balance+"$");
    };

}
