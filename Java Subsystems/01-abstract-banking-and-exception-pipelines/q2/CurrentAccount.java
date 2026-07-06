public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountHolder,
                          double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() { return overdraftLimit; }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance + overdraftLimit) {
            System.out.println("Withdrawal denied. Exceeds overdraft limit. Available: " + (balance + overdraftLimit));
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
    }

    @Override
    public void display() {
        System.out.println("[CurrentAccount] Account No: " + accountNumber +
            " | Holder: " + accountHolder +
            " | Balance: " + balance +
            " | Overdraft Limit: " + overdraftLimit);
    }
}
