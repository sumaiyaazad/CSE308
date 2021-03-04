package Bank;

import Accounts.*;
import Employees.Employees;

import java.util.ArrayList;

public class Bank {
    public ArrayList<Accounts> accounts;

//    public ArrayList<Employees> employees;
//
    public int internalFund;
//
//    public ArrayList<Object> loanRequests;
//
    public Bank() {
        accounts = new ArrayList<Accounts>();
//        employees = new ArrayList<Employees>();
        internalFund = 1000000;
//        loanRequests = new ArrayList<Object>();
//        accounts.add(s1);
//        accounts.add(s2);
    }

    public ArrayList<Accounts> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Accounts> accounts) {
        this.accounts = accounts;
    }

//    public ArrayList<Employees> getEmployees() {
//        return employees;
//    }
//
//    public void setEmployees(ArrayList<Employees> employees) {
//        this.employees = employees;
//    }
//
    public int getInternalFund() {
        return internalFund;
    }

    public void setInternalFund(int internalFund) {
        this.internalFund = internalFund;
    }
//
//    public ArrayList<Object> getLoanRequests() {
//        return loanRequests;
//    }
//
//    public void setLoanRequests(ArrayList<Object> loanRequests) {
//        this.loanRequests = loanRequests;
//    }
}
