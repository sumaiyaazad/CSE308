package Bank;

import Accounts.*;
import Employees.*;
import Loan.Loan;

import java.util.ArrayList;

public class Bank {
    public ArrayList<Accounts> accounts;

    public ArrayList<Employees> employees;

    public ManagingDirector MD;

    public Officer O1;

    public Officer O2;

    public Cashier C1;

    public Cashier C2;

    public Cashier C3;

    public Cashier C4;

    public Cashier C5;

    public int internalFund;

    public ArrayList<Loan> loanRequests;

    public Bank() {
        accounts = new ArrayList<Accounts>();
        employees = new ArrayList<Employees>();
        loanRequests = new ArrayList<Loan>();
        internalFund = 1000000;
        createEmployees();
        System.out.println("Bank Created; MD,S1,S2,C1,C2,C3,C4,C5 created");
    }

    private void createEmployees() {
        MD = new ManagingDirector("MD");
        O1 = new Officer("O1");
        O2 = new Officer("O2");
        C1 = new Cashier("C1");
        C2 = new Cashier("C2");
        C3 = new Cashier("C3");
        C4 = new Cashier("C4");
        C5 = new Cashier("C5");
        employees.add(MD);
        employees.add(O1);
        employees.add(O2);
        employees.add(C1);
        employees.add(C2);
        employees.add(C3);
        employees.add(C4);
        employees.add(C5);
    }

    public ArrayList<Accounts> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Accounts> accounts) {
        this.accounts = accounts;
    }

    public int getInternalFund() {
        return internalFund;
    }

    public void setInternalFund(int internalFund) {
        this.internalFund = internalFund;
    }

    public ArrayList<Loan> getLoanRequests() {
        return loanRequests;
    }

    public void setLoanRequests(ArrayList<Loan> loanRequests) {
        this.loanRequests = loanRequests;
    }

    public ArrayList<Employees> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employees> employees) {
        this.employees = employees;
    }

    public void inc() {
        if (accounts.size() == 0) {
            return;
        }
        for (Accounts account : accounts) {
            account.setYear(account.getYear() + 1);
        }
    }
}
