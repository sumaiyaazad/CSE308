package Employees;

import Accounts.Accounts;
import Bank.Bank;

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

    public abstract void approveLoan();

    public void change(String accountType,float interestRate,Bank bank){
        System.out.println("You don’t have permission for this operation");
    };

    public abstract void see();
}
