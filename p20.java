// 20. Program to input name and balance of customer and trigger a user-defined exception if balance < 1000.
class LowBalanceException extends Exception {
    LowBalanceException(String message) {
        super(message);
    }
}

class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void checkBalance() throws LowBalanceException {
        if (balance < 1000) {
            throw new LowBalanceException("Balance is less than 1000.");
        } else {
            System.out.println("Balance is sufficient.");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        try {
            Customer customer = new Customer("Alice", 900);
            customer.checkBalance();
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
/* 
Output:
Balance is less than 1000.
*/
