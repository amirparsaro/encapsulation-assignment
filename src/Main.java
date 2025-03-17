import bank.*;

public class Main {
    public static void main(String[] args) {
        BankCustomers theBank = new BankCustomers();
        TransactionAccount transactionAccount1 = new TransactionAccount("2025-1-001", "AmirParsa Rouhani", 1500);
        theBank.addAccount(transactionAccount1);
        TransactionAccount transactionAccount2 = new TransactionAccount("2025-1-002", "Sara Rouhani", 2000);
        theBank.addAccount(transactionAccount2);
        TransactionAccount transactionAccount3 = new TransactionAccount("2025-1-003", "mmmd mmdi", 1000);
        theBank.addAccount(transactionAccount3);

        SavingAccount savingAccount1 = new SavingAccount("2025-2-001", "AmirParsa Rouhani", 5000);
        theBank.addAccount(savingAccount1);
        SavingAccount savingAccount2 = new SavingAccount("2025-2-002", "Sara Rouhani", 6000);
        theBank.addAccount(transactionAccount2);
        SavingAccount savingAccount3 = new SavingAccount("2025-2-003", "mmd mmdi", 5500);
        theBank.addAccount(transactionAccount3);

        theBank.findAccount("2025-1-003");
        theBank.findAccount("2025-1-004");

        System.out.println(savingAccount1.getBalance());
        savingAccount1.deposit(1000);
        System.out.println(savingAccount1.getBalance());

        transactionAccount1.deposit(-500);

        savingAccount2.calculateInterest();
        transactionAccount2.calculateInterest();
        System.out.println(savingAccount2.getBalance());
        System.out.println(transactionAccount2.getBalance());

        savingAccount1.withdraw(1000);
        savingAccount2.withdraw(-500);
        savingAccount3.withdraw(100000);

        transactionAccount1.withdraw(100);
        transactionAccount2.withdraw(-500);
        transactionAccount3.withdraw(100000);

        theBank.showAllBalances();
    }
}