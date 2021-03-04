package Accounts;

public abstract class Accounts {

    public float balance;

    public int loan;

    public String name;

    public int year;

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getLoan() {
        return loan;
    }

    public void setLoan(int loan) {
        this.loan = loan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void create(String accountName, int amount){
        balance=amount;
        loan=0;
        name=accountName;
        year=0;
        System.out.println("Student account for "+name+" Created; initial balance "+balance+"$");
    };

    public void deposit(int amount){
        balance+=amount;
        System.out.println(amount+"$ deposited; current balance "+balance+"$");
    };

    public abstract void withdraw(int amount);

    public abstract void requestLoan(int amount);

    public abstract void query();

}
