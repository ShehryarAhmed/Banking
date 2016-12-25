package com.company;

/**
 * Created by android on 12/25/2016.
 */
public class CurrentAccount extends AccountFeatures {
    @Override
    void withdrawMoney() {

    }

    @Override
    double retrieveAccountBalance() {
        return 0;
    }

    @Override
    void transferMoney() {

    }

    @Override
    void depositMoney() {

    }

    @Override
    void AccountType() {
        AccountDetail ad = new AccountDetail();
        ad.setAccountType("Current Account");
    }
}
