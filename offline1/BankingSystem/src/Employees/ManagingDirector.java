package Employees;

import Accounts.Accounts;
import Bank.Bank;

public class ManagingDirector extends Employees{
    public ManagingDirector(String employeeName){
        name=employeeName;
    }

    @Override
    public void change(String accountType, float interestRate, Bank bank) {
        for(Accounts account:bank.getAccounts()){
            if(account.getType().equals(accountType)){
                account.setInterestRate(interestRate);
            }
        }
    }

    @Override
    public void see(Bank bank) {
        System.out.println("Internal Fund : "+bank.getInternalFund()+"$");
    }
}
