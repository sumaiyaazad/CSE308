import Accounts.*;
import Bank.Bank;
import Employees.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Accounts userAccount=new Student();
        Employees employee=new Cashier("");
        Scanner s = new Scanner(System.in);
        int checkCategory=-1;
        for (int i = 0; ; i++) {
            int check=0;
            String input = s.nextLine();
            String[] inputArray = input.split("\\s+");
            if(input.startsWith("INC")){
                bank.inc();
                System.out.println("1 year passed");
            }
            if (input.startsWith("Create")) {
                //System.out.println("inputArray: "+inputArray[1]);
                //System.out.println("Accounts array: "+bank.getAccounts());
                for (Accounts account : bank.getAccounts()) {
                    if (account.getName().equals(inputArray[2])) {
                        System.out.println("Sorry! Could not create account(name already taken)");
                        check=1;
                        break;
                    }
                }
                if(check==1){
                    continue;
                }
               if (inputArray[1].equals("Savings")) {
                    userAccount = new Savings();
                }
                else if (inputArray[1].equals("FixedDeposit")) {
                    userAccount = new FixedDeposit();
                }
                check=userAccount.create(inputArray[2], Integer.parseInt(inputArray[3]));
                if(check==1){
                    bank.getAccounts().add(userAccount);
                }
                checkCategory=0;
                //print Accounts array from bank
                if (bank.getAccounts().size() != 0) {
                    for (Accounts account : bank.getAccounts()) {
                        System.out.println(account.getName() + " " + account.getBalance());
                    }
                }
            }
            if(input.startsWith("Deposit")){
                if(userAccount.getName()==null){
                    System.out.println("Open/Create your account to deposit");
                }
                else{
                    userAccount.deposit(Integer.parseInt(inputArray[1]));
                }
            }
            if(input.startsWith("Withdraw")){
                if(userAccount.getName()==null){
                    System.out.println("Open/Create your account to deposit");
                }
                else{
                    userAccount.withdraw(Integer.parseInt(inputArray[1]));
                }
            }
            if(input.startsWith("Query")){
                if(userAccount.getName()==null){
                    System.out.println("Open/Create your account to deposit");
                }
                else{
                    userAccount.query();
                }
            }
            if(input.startsWith("Request")){
                if(userAccount.getName()==null){
                    System.out.println("Open/Create your account to deposit");
                }
                else{
                    userAccount.requestLoan(Integer.parseInt(inputArray[1]),bank);
                }
            }
            if(input.startsWith("Open")){
                for(Employees fixedEmployee:bank.getEmployees()){
                    if(fixedEmployee.getName().equals(inputArray[1])){
                        checkCategory=1;
                        employee=fixedEmployee;
                        System.out.println(employee.getName()+" Active, "+bank.getLoanRequests().size()+" loan requests pending");
                        break;
                    }
                }
                if(check==1){
                    continue;
                }
                for(Accounts account:bank.getAccounts()) {
                    if (account.getName().equals(inputArray[1])) {
                        checkCategory = 0;
                        userAccount = account;
                        System.out.println("Welcome back!! " + userAccount.getName());
                        break;
                    }
                }
            }
            if(input.startsWith("Close")){
                if(checkCategory==0){
                    System.out.println("Transaction closed for "+userAccount.getName());
                    userAccount=new Student();
                }
                else if(checkCategory==1){
                    System.out.println("Operation closed for "+employee.getName());
                    employee=new Cashier("");
                }
            }
            if(input.startsWith("Lookup")){
                if(employee.getName().equals("")){
                    System.out.println("Open your account to lookup");
                }
                else{
                    employee.lookup(inputArray[1],bank);
                }
            }
            if(input.startsWith("Approve Loan")){
                if(employee.getName().equals("")){
                    System.out.println("Open your account to approve loan");
                }
                else{
                    employee.approveLoan(bank);
                }
            }
        }
    }
}
