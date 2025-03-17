package bank;

public class TransactionAccount extends BankAccount {
    private final double overDraftLimit = 500;

    public TransactionAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("There is no interest for a transaction account.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("[Error] Wrong withdraw amount. Make sure the amount is not negative.");
        } else if (amount > super.balance - overDraftLimit) {
            System.out.println("[Error] Wrong withdraw amount. The amount is larger than your balance.");
        } else {
            this.balance -= amount;
            System.out.println(amount + " has been successfully withdrawn from account with account number " + super.getAccountNumber() + ".");
        }
    }
}