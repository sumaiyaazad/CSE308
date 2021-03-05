package Employees;

import Accounts.Accounts;
import Bank.Bank;

public class ManagingDirector extends Employees{
    public ManagingDirector(String employeeName){
        name=employeeName;
    }

    @Override
    public void change(String accountType, float interestRate, Bank bank) {
        if(bank.getAccounts().size()==0){
            System.out.println("No account to apply this change");
        }
        else{
            for(Accounts account:bank.getAccounts()){
                if(account.getType().equals(accountType)){
                    account.setInterestRate(interestRate);
                }
            }
            System.out.println("Changed interest rate");
        }
    }

    @Override
    public void see(Bank bank) {
        System.out.println("Internal Fund : "+bank.getInternalFund()+"$");
    }
}
