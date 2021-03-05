package Employees;

import Bank.Bank;

public class Cashier extends Employees {
    public Cashier(String employeeName){
        name=employeeName;
    }

    @Override
    public void approveLoan(Bank bank) {
        System.out.println("You are not allowed to approve loan");
    }
}
