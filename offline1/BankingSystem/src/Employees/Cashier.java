package Employees;

import Bank.Bank;

public class Cashier extends Employees {
    public Cashier() {
    }

    @Override
    public void approveLoan(Bank bank) {
        System.out.println("You are not allowed to approve loan");
    }
}
