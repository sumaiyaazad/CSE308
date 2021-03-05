package Loan;

import Accounts.Accounts;

public class Loan {
    public Accounts account;

    public int requestedLoanAmount;

    public Loan(Accounts userAccount, int amount){
        account=userAccount;
        requestedLoanAmount=amount;
    }

    public Accounts getAccount() {
        return account;
    }

    public void setAccount(Accounts account) {
        this.account = account;
    }

    public int getRequestedLoanAmount() {
        return requestedLoanAmount;
    }

    public void setRequestedLoanAmount(int requestedLoanAmount) {
        this.requestedLoanAmount = requestedLoanAmount;
    }
}
