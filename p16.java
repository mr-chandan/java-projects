// 16. Create an abstract class BankAccount with abstract methods deposit() and withdraw().
// Implement two subclasses SavingsAccount and CheckingAccount.
abstract class BankAccount {
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    private double balance = 0;

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Savings Account. Current balance: " + balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account. Current balance: " + balance);
        } else {
            System.out.println("Insufficient balance in Savings Account.");
        }
    }
}

class CheckingAccount extends BankAccount {
    private double balance = 0;

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Checking Account. Current balance: " + balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Checking Account. Current balance: " + balance);
        } else {
            System.out.println("Insufficient balance in Checking Account.");
        }
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount();
        BankAccount checking = new CheckingAccount();

        savings.deposit(1000);
        savings.withdraw(500);

        checking.deposit(2000);
        checking.withdraw(2500);
    }
}
/* 
Output:
Deposited 1000.0 to Savings Account. Current balance: 1000.0
Withdrew 500.0 from Savings Account. Current balance: 500.0
Deposited 2000.0 to Checking Account. Current balance: 2000.0
Insufficient balance in Checking Account.
*/
