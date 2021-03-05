package Employees;

import Accounts.Accounts;
import Bank.Bank;
import Loan.Loan;

import java.util.ArrayList;

public abstract class Employees {
    //public String Name;

    Employees(){
        //bank=new Bank();
    }

    public void lookup(String AccountName,Bank bank) {
        for(Accounts account:bank.getAccounts()){
            if(account.getName().equals(AccountName)){
                System.out.println("Current Balace ("+account.getName()+") : "+account.getBalance()+"$");
                return;
            }
        }
    };

    public void approveLoan(Bank bank){
        for(Loan loan:bank.getLoanRequests()){
            loan.getAccount().setLoan(loan.getAccount().getLoan()+loan.getRequestedLoanAmount());
            loan.getAccount().setBalance(loan.getAccount().getBalance()+loan.getRequestedLoanAmount());
            System.out.println("Loan for "+loan.getAccount().getName()+" approved");
        }
        bank.setLoanRequests(new ArrayList<Loan>());
    };

    public void change(String accountType,float interestRate,Bank bank){
        System.out.println("You don’t have permission for this operation");
    };

    public  void see(Bank bank){
        System.out.println("You don’t have permission for this operation");
    };
}
