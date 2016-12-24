package com.company;

import java.util.Scanner;

/**
 * Created by android on 12/25/2016.
 */
public class Banking {
    CreateAccount createAccount;
    //array of object
    CreateAccount createAccounts[] = new CreateAccount[10];
    //index
    int accountIndex = 0;
    //user id

    int i = 0;

    Scanner getval = new Scanner(System.in);
    private void initializeAccount(){
        createAccount = new CreateAccount();
        createAccount.setAccountName("User"+ i++);
        createAccount.setAccountNumber(111-000-111- + i);
        createAccount.setAddress("karachi,pakistan");
        createAccount.setAccountBalance(5000.00);
        createAccount.setAccountType("Current Account");
        saveAccount(createAccount);
    }

    private void addAccount(){
        createAccount = new CreateAccount();
        createAccount.creationAccount();
        saveAccount(createAccount);
    }

    private void saveAccount(CreateAccount ca){
        createAccounts[accountIndex++] = ca;
    }

    public void BankABC(){
        System.out.println("1. Create Account \n" +
                "2.Login Account");
        int getnum = getval.nextInt();
       switch (getnum){
           case 1 :
               initializeAccount();
           case 2:

       }

    }

    private void signIn(){
        System.out.println("Enter Account title : ");
        String getTitle = getval.next();
        System.out.println("Enter Account Number : ");
        int getNum = getval.nextInt();
        int i = 0;
        while (i<10){
        if (getTitle == createAccounts[i].getAccountName() && getNum == createAccounts[i].getAccountNumber()){

        }
        }

    }


}
