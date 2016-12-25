package com.company;

import sun.dc.pr.PRError;

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

    private void initializeAccount() {
        createAccount = new CreateAccount();
        createAccount.setAccountName("User" + i++);
        createAccount.setAccountNumber(111+i);
        createAccount.setAddress("karachi,pakistan");
        createAccount.setAccountBalance(5000.00);
        saveAccount(createAccount);
    }

    private void addAccount() {
        createAccount = new CreateAccount();
        createAccount.creationAccount();
        saveAccount(createAccount);
    }

    private void saveAccount(CreateAccount ca) {
        createAccounts[accountIndex++] = ca;
    }

    public void BankABC() {
        initializeAccount();
        System.out.println("1. Create Account \n" +
                "2.Login Account");
        int getnum = getval.nextInt();
        switch (getnum) {
            case 1:
                initializeAccount();

                break;
            case 2:
                signIn();
                break;
            default:
                System.out.println("Wrong Select.");
        }

    }


    private void signIn() {
        System.out.println("Enter Account title : ");
        String getTitle = getval.next();
        System.out.println("Enter Account Number : ");
        int getNum = getval.nextInt();
        System.out.println(getNum);
        while (i < 10) {

            if ( createAccounts[i] != null ) {
                break;
            }
            i++;
        }
        aftersignin(0);

    }

    private void aftersignin(int id) {
        System.out.println("1. Current Account \n" +
                "2. Saving Account");
        int getAccountType = getval.nextInt();
        switch (getAccountType) {
            case 1:
                CurrentAccount ca = new CurrentAccount();
                CurrentAccountProfile(ca, id);
                break;
            case 2:
                SavingAccount sa = new SavingAccount();
                SavingAccountProfile(sa, id);
                break;
            default:
                System.out.println("Wrong Select ...");
                break;
        }
    }

    private int menu() {

        System.out.println("1. Show Account Detail \n" +
                "2. WithdrawMoney \n" +
                "3. retrieveMoney \n" +
                "4. transferMoney \n" +
                "5. depositMoney");
        return getval.nextInt();

    }

    private void showAccountDetail(int index) {
        System.out.println("Account Title : " + createAccounts[index].getAccountName()
                + "Account Number : " + createAccounts[index].getAccountNumber()
                + "Account Type : " + createAccounts[index].getAccountType()
                + "Account Balance : " + createAccounts[index].getAccountBalance()
        );
    }

    private void CurrentAccountProfile(CurrentAccount ca, int id) {
        int selectmenu = menu();
        switch (selectmenu) {
            case 1:
                showAccountDetail(id);
                break;
            case 2:
                ca.withdrawMoney();
                break;
            case 3:
                ca.retrieveAccountBalance();
                break;
            case 4:
                ca.transferMoney();
                break;
            case 5:
                ca.depositMoney();

                break;
            default:
                System.out.println("Wrong Select");
                break;
        }
    }

    private void SavingAccountProfile(SavingAccount ca, int id) {
        int selectmenu = menu();
        switch (selectmenu) {
            case 1:
                showAccountDetail(id);
                break;
            case 2:
                ca.withdrawMoney();
                break;
            case 3:
                ca.retrieveAccountBalance();
                break;
            case 4:
                ca.transferMoney();
                break;
            case 5:
                ca.depositMoney();

                break;
            default:
                System.out.println("Wrong Select");
                break;
        }
    }
}
