import banking.*;

public class Main {
    public static void main(String[] args) {
        Account[] accounts = {
            new FixedDepositAccount("FD001", "Shivam", 100000, 12),
            new FixedDepositAccount("FD002", "Naman",    50000,  6),
            new RecurringDepositAccount("RD001", "Abhay", 20000, 5000),
            new RecurringDepositAccount("RD002", "Mohit",   15000, 3000)
        };

        System.out.println("Accounts Before Interest ");
        for (Account a : accounts) {
            a.display();
        }

        System.out.println("\nAdding Interest ");
        for (Account a : accounts) {
            if (a instanceof InterestBearing) {
                ((InterestBearing) a).addInterest();
            }
        }

        System.out.println("\nAccounts After Interest ");
        for (Account a : accounts) {
            a.display();
        }
    }
}
