package com.company;

/**
 * Created by android on 12/25/2016.
 */
public abstract class BankAccountDetail {
    String AccountName;
    int AccountNumber;
    String Address;
    Float AccountBalance;

    abstract void withdrawMoney();

    abstract Float retrieveAccountBalance();

    abstract void transferMoney();

    abstract void depositMoney();

}
