package banking;

public abstract class Account {
    protected String accNo;
    protected String holder;
    protected double balance;

    public Account(String accNo, String holder, double balance) {
        this.accNo = accNo;
        this.holder = holder;
        this.balance = balance;
    }

    public String getAccNo() { return accNo; }
    public String getHolder() { return holder; }
    public double getBalance() { return balance; }

    public abstract void display();
}
