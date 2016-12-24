package com.company;

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

    private void initializeAccount(){
        createAccount = new CreateAccount();
        createAccount.setAccountName("User"+ i++);
        createAccount.setAccountNumber(111-000-111- + i);
        createAccount.setAddress("karachi,pakistan");
        createAccount.setAccountBalance(5000.00);
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
}
