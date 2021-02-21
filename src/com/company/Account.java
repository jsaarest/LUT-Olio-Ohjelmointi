package com.company;

public class Account {
    String accountNumber;
    int accountBalance;

    public Account(String id, int bal){
        accountNumber = id;
        accountBalance = bal;
    }

    public void addMoney(int amount){
        accountBalance += amount;
    }

    public void withdrawMoney(int amount){
        if(amount < accountBalance){
            accountBalance -= amount;
        }
    }

    public int getAccountBalance(){
        return accountBalance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void getAccountInformation(){
        System.out.println("Account number: " + accountNumber + " Amount of money: " + accountBalance);
    }

}

class CurrentAccount extends Account {
    public CurrentAccount(String accountNumber, int accountBalance) {
        super(accountNumber, accountBalance);
    }
}
class CreditAccount extends Account {
    protected int creditLimit;

    public CreditAccount(String accountNumber, int accountBalance, int limit) {
        super(accountNumber, accountBalance);
        creditLimit = limit;
    }
    public int getCreditLimit(){
        return creditLimit;
    }

    public void setCreditLimit(int limit){ creditLimit = limit; }

    public void getAccountInformation(){
        System.out.println("Account number: " + accountNumber + " Amount of money: " + accountBalance + " Credit limit: " + creditLimit);
    }
    public void withdrawMoney(int amount){
        if(amount < accountBalance + creditLimit){
            accountBalance -= amount;
        }
    }
}
