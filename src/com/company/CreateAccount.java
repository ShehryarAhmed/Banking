package com.company;

import java.util.Scanner;

/**
 * Created by android on 12/25/2016.
 */
public class CreateAccount extends AccountDetail {
    Scanner getval = new Scanner(System.in);

    int getType = 0;

    public void creationAccount(){

        System.out.println("Enter Account Title : ");
        setAccountName(getval.next());
        System.out.println("Enter Account Number : ");
        setAccountNumber(getval.nextInt());
        System.out.println("Enter Address : ");
        setAddress(getval.next());
        System.out.println("Enter Deposit Amount : ");
        setAccountBalance(getval.nextFloat());
        while (!checkAccountType(getType)) {
            System.out.println("Account Type : " +
                    "\n 1. Current Account " +
                    "\n 2. Saving Account ");
            getType = getval.nextInt();
        }
        if (getType == 1){
            setAccountType("Current Account");
        }
        else {
            setAccountType("Saving Account");
        }
    }
    private boolean checkAccountType(int getnum){
        if(getnum == 1 || getnum == 2){
            return true;
        }
        return false;
    }

}
