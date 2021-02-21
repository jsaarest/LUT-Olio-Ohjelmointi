package com.company;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts = new ArrayList<Account>();

    public void createCurrentAccount(String accountNumber, int accountBalance){
        accounts.add(new CurrentAccount(accountNumber, accountBalance));
    }
    public void createCreditAccount(String accountNumber, int accountBalance, int creditLimit){
        accounts.add(new CreditAccount(accountNumber, accountBalance, creditLimit));
    }
    public void deleteAccount(String accountNumber){
        accounts.remove(findAccount(accountNumber));
    }

    public Account findAccount(String id){
        for (Account account : accounts) {
            if(account.getAccountNumber().equals(id)) {
                return account;
            }
        }
        return null;
    }
    public void getAllAccountInformation(){
        for (Account account : accounts) {
            account.getAccountInformation();
        }
    }


}


