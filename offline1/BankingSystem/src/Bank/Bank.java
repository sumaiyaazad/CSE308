package Bank;

import Accounts.*;
import Employees.*;
import Loan.Loan;

import java.util.ArrayList;

public class Bank {
    public ArrayList<Accounts> accounts;

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
        internalFund = 1000000;
        MD = new ManagingDirector();
        O1 = new Officer();
        O2 = new Officer();
        C1 = new Cashier();
        C2 = new Cashier();
        C3 = new Cashier();
        C4 = new Cashier();
        C5 = new Cashier();
        loanRequests = new ArrayList<Loan>();
        System.out.println("Bank Created; MD,S1,S2,C1,C2,C3,C4,C5 created");
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

    public void inc() {
        if (accounts.size() == 0) {
            return;
        }
        for (Accounts account : accounts) {
            account.setYear(account.getYear() + 1);
        }
    }
}
