package bank;

public abstract class BankAccount {
    final private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public abstract void calculateInterest();

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("[Error] Wrong deposit amount. Make sure the amount is not negative.");
        } else {
            this.balance += amount;
            System.out.println(amount + " has been successfully deposited into account with account number " + this.accountNumber + ".");
        }
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("[Error] Wrong withdraw amount. Make sure the amount is not negative.");
        } else if (amount > this.balance) {
            System.out.println("[Error] Wrong withdraw amount. The amount is larger than your balance.");
        } else {
            this.balance -= amount;
            System.out.println(amount + " has been successfully withdrawn from account with account number " + this.accountNumber + ".");
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }
}