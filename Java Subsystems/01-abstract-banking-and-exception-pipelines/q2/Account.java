public class Account {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal denied.");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
    }

    public String getAccountNumber() { return accountNumber; }
    public String getAccountHolder() { return accountHolder; }
    public double getBalance() { return balance; }

    public void display() {
        System.out.println("Account No: " + accountNumber +
            " | Holder: " + accountHolder +
            " | Balance: " + balance);
    }
}
