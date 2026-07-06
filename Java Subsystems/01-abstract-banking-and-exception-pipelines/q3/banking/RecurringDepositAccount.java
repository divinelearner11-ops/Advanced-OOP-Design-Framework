package banking;

public class RecurringDepositAccount extends Account implements InterestBearing {
    private double monthlyDeposit;

    public RecurringDepositAccount(String accNo, String holder, double balance, double monthlyDeposit) {
        super(accNo, holder, balance);
        this.monthlyDeposit = monthlyDeposit;
    }

    // 6% annual interest on average balance
    // Average balance = (balance + balance + monthlyDeposit) / 2 (simple average of start and end)
    @Override
    public void addInterest() {
        double avgBalance = (balance + (balance + monthlyDeposit)) / 2.0;
        double interest = avgBalance * 0.06;
        balance += interest;
        System.out.println("RD [" + accNo + "] Interest added: " + String.format("%.2f", interest));
    }

    @Override
    public void display() {
        System.out.println("[RecurringDeposit] Acc: " + accNo +
            " | Holder: " + holder +
            " | Balance: " + String.format("%.2f", balance) +
            " | Monthly Deposit: " + monthlyDeposit);
    }
}
