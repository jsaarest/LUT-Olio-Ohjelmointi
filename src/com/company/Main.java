package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);
        int userSelect;

        String accountNumber = "";
        int accountBalance = 0;
        int creditLimit = 0;
        Account account;

        Bank bankSystem = new Bank();

        do {
            System.out.print("\n");
            System.out.println("*** BANK SYSTEM ***");
            System.out.println("1) Add a regular account");
            System.out.println("2) Add a credit account");
            System.out.println("3) Deposit money");
            System.out.println("4) Withdraw money");
            System.out.println("5) Remove an account");
            System.out.println("6) Print account information");
            System.out.println("7) Print all accounts");
            System.out.println("0) Quit");
            System.out.print("Your choice: ");
            userSelect = input.nextInt();

            switch(userSelect){
                case 1:
                    System.out.print("Give an account number: ");
                    accountNumber = stringInput.nextLine();
                    System.out.print("Amount of money to deposit: ");
                    accountBalance = input.nextInt();
                    System.out.println("Account created.");
                    bankSystem.createCurrentAccount(accountNumber, accountBalance);
                    break;
                case 2:
                    System.out.print("Give an account number: ");
                    accountNumber = stringInput.nextLine();
                    System.out.print("Amount of money to deposit: ");
                    accountBalance = input.nextInt();
                    System.out.print("Give a credit limit: ");
                    creditLimit = input.nextInt();
                    System.out.println("Account created.");
                    bankSystem.createCreditAccount(accountNumber, accountBalance, creditLimit);
                    break;
                case 3:
                    System.out.print("Give an account number: ");
                    accountNumber = stringInput.nextLine();
                    System.out.print("Amount of money to deposit: ");
                    accountBalance = input.nextInt();
                    account = bankSystem.findAccount(accountNumber);
                    account.addMoney(accountBalance);
                    break;
                case 4:
                    System.out.print("Give an account number: ");
                    accountNumber = stringInput.nextLine();
                    System.out.print("Amount of money to withdraw: ");
                    accountBalance = input.nextInt();
                    account = bankSystem.findAccount(accountNumber);
                    account.withdrawMoney(accountBalance);
                    break;
                case 5:
                    System.out.print("Give the account number of the account to delete: ");
                    accountNumber = stringInput.nextLine();
                    bankSystem.deleteAccount(accountNumber);
                    System.out.println("Account removed.");
                    break;
                case 6:
                    System.out.print("Give the account number of the account to print information from: ");
                    accountNumber = stringInput.nextLine();
                    account = bankSystem.findAccount(accountNumber);
                    System.out.println("Account number: " + accountNumber + " Amount of money: " + account.getAccountBalance());
                    break;
                case 7:
                    System.out.println("All accounts:");
                    bankSystem.getAllAccountInformation();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;

            }
        }

        while(userSelect > 0);


    }
}