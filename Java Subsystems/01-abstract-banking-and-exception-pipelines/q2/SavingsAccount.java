public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder,
                          double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() { return interestRate; }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (balance - amount < 1000) {
            System.out.println("Withdrawal denied. Balance cannot fall below 1000. Current Balance: " + balance);
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
    }

    @Override
    public void display() {
        System.out.println("[SavingsAccount] Account No: " + accountNumber +
            " | Holder: " + accountHolder +
            " | Balance: " + balance +
            " | Interest Rate: " + interestRate + "%");
    }
}
