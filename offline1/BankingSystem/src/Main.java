import Accounts.*;
import Bank.Bank;
import Employees.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Accounts userAccount=new Student();
        Employees employee=new Cashier();
        String employeeName="";
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
                    userAccount.requestLoan(Integer.parseInt(inputArray[1]));
                }
            }
            if(input.startsWith("Open")){
                String[] employeeList={"MD","O1","O2","C1","C2","C3","C4","C5"};
                if(inputArray[1].equals("MD")){
                    checkCategory=1;
                    employeeName="MD";
                    employee=bank.MD;
                    employee.lookup("Alice",bank);
                }
                else if(inputArray[1].equals("O1")){
                    checkCategory=1;
                    employeeName="O1";
                    employee=bank.O1;
                    employee.lookup("Alice",bank);
                }
                else if(inputArray[1].equals("O2")){
                    checkCategory=1;
                    employeeName="O2";
                    employee=bank.O2;
                    employee.lookup("Alice",bank);
                }
                else if(inputArray[1].equals("C1")){
                    checkCategory=1;
                    employeeName="C1";
                    employee=bank.C1;
                    employee.lookup("Alice",bank);
                }
                else if(inputArray[1].equals("C2")){
                    checkCategory=1;
                    employeeName="C2";
                    employee=bank.C2;
                    employee.lookup("Alice",bank);
                }
                else if(inputArray[1].equals("C3")){
                    checkCategory=1;
                    employeeName="C3";
                    employee=bank.C3;
                    employee.lookup("Alice",bank);
                }
                else if(inputArray[1].equals("C4")){
                    checkCategory=1;
                    employeeName="C4";
                    employee=bank.C4;
                    employee.lookup("Alice",bank);
                }
                else if(inputArray[1].equals("C5")){
                    checkCategory=1;
                    employeeName="C5";
                    employee=bank.C5;
                    employee.lookup("Alice",bank);
                }
                else{
                    for(Accounts account:bank.getAccounts()){
                        if(account.getName().equals(inputArray[1])){
                            checkCategory=0;
                            userAccount=account;
                            System.out.println("Welcome back!! "+userAccount.getName());
                            break;
                        }
                    }
                }
            }
            if(input.startsWith("Close")){
                if(checkCategory==0){
                    System.out.println("Transaction closed for "+userAccount.getName());
                    userAccount=new Student();
                }
                else if(checkCategory==1){
                    System.out.println("Operation closed for "+employeeName);
                    employee=new Cashier();
                }
            }
        }
    }
}
