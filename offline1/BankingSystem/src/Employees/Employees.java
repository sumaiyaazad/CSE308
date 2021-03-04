package Employees;

import Bank.Bank;

public abstract class Employees {
    private Bank bank;

    Employees(){
        bank=new Bank();
    }

    public void lookup(String AccountName) {

        return;
    };

    public abstract void approveLoan();

    public abstract void change();

    public abstract void see();
}
