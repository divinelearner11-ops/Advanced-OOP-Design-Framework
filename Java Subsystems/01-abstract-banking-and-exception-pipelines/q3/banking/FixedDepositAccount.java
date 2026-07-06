package banking;

public class FixedDepositAccount extends Account implements InterestBearing {
    private int tenureMonths;

    public FixedDepositAccount(String accNo, String holder, double balance, int tenureMonths) {
        super(accNo, holder, balance);
        this.tenureMonths = tenureMonths;
    }

    // 7% annual interest, pro-rated for tenureMonths
    @Override
    public void addInterest() {
        double interest = balance * 0.07 * (tenureMonths / 12.0);
        balance += interest;
        System.out.println("FD [" + accNo + "] Interest added: " + String.format("%.2f", interest));
    }

    @Override
    public void display() {
        System.out.println("[FixedDeposit] Acc: " + accNo +
            " | Holder: " + holder +
            " | Balance: " + String.format("%.2f", balance) +
            " | Tenure: " + tenureMonths + " months");
    }
}
