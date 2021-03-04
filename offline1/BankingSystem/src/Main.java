import Accounts.*;
import Bank.Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank=new Bank();
        Scanner s = new Scanner(System.in);
        for(int i=0;;i++){
            String input=s.nextLine();
            if(input.startsWith("Create")){
                String[] inputArray=input.split("\\s+");
                System.out.println("inputArray: "+inputArray[1]);
                System.out.println("Accounts array: "+bank.getAccounts());
                for (Accounts account : bank.getAccounts()) {
                    if(account.getName().equals(inputArray[2])){
                        System.out.println("Sorry! Could not create account(name already taken)");
                        break;
                    }
                }
                if(inputArray[1].equals("Student")){
                    Student student=new Student();
                    student.create(inputArray[2],Integer.parseInt(inputArray[3]));
                    bank.getAccounts().add(student);
                }
                if(inputArray[1].equals("Savings")){
                    Savings savings=new Savings();
                    savings.create(inputArray[2],Integer.parseInt(inputArray[3]));
                    bank.getAccounts().add(savings);
                }
                if(inputArray[1].equals("FixedDeposit")){
                    FixedDeposit fixedDeposit=new FixedDeposit();
                    fixedDeposit.create(inputArray[2],Integer.parseInt(inputArray[3]));
                    bank.getAccounts().add(fixedDeposit);
                }
                //print Accounts array
                for(Accounts account : bank.getAccounts()){
                    System.out.println(account.getName()+" "+account.getBalance());
                }
            }
        }
    }
}
