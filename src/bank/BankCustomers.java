package bank;

import java.util.ArrayList;

public class BankCustomers {
    private ArrayList<BankAccount> accountsList = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accountsList.add(account);
    }

    public void showAllBalances() {
        System.out.println();
        System.out.println("Showing all accounts' details:");
        System.out.println("------------------------------------------");
        for (BankAccount account : accountsList) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Holder Name: " + account.getAccountHolderName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("------------------------------------------");
        }
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accountsList) {
            if (accountNumber.equals(account.getAccountNumber())) {
                System.out.println("Account found with number " + accountNumber);
                return account;
            }
        }
        System.out.println("[Error] No accounts found with number " + accountNumber);
        return null;
    }
}