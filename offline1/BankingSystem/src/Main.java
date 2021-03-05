import Accounts.*;
import Bank.Bank;
import Employees.Employees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Accounts userAccount;
        Scanner s = new Scanner(System.in);
        int check=0;
        for (int i = 0; ; i++) {
            String input = s.nextLine();
            if (input.startsWith("Create")) {
                String[] inputArray = input.split("\\s+");
                //System.out.println("inputArray: "+inputArray[1]);
                //System.out.println("Accounts array: "+bank.getAccounts());
                for (Accounts account : bank.getAccounts()) {
                    if (account.getName().equals(inputArray[2])) {
                        System.out.println("Sorry! Could not create account(name already taken)");
                        break;
                    }
                }
               if (inputArray[1].equals("Savings")) {
                    userAccount = new Savings();
                }
                else if (inputArray[1].equals("FixedDeposit")) {
                    userAccount = new FixedDeposit();
                }
                else{
                    userAccount=new Student();
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

        }
    }
}
