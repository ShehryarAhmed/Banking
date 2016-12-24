package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by android on 12/25/2016.
 */
public class CreateAccount extends BankAccountDetail {
    Scanner getval = new Scanner(System.in);

    public void creationAccount(){

        System.out.println("Enter Account Title : ");
        setAccountName(getval.next());
        System.out.println("Enter Account Number : ");
        setAccountNumber(getval.nextInt());
        System.out.println("Enter Address : ");
        setAddress(getval.next());
        System.out.println("Enter Deposit Amount : ");
        setAccountBalance(getval.nextFloat());
    }

}
