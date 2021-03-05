import Accounts.*;
import Bank.Bank;
import Employees.Employees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Accounts userAccount=new Student();
        Scanner s = new Scanner(System.in);
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
        }
    }
}
