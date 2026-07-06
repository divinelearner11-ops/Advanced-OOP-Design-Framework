public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA001", "Manyy", 5000, 4.5);
        CurrentAccount ca = new CurrentAccount("CA001", "Cristine", 3000, 2000);

        System.out.println("\nInitial State");
        sa.display();
        ca.display();

        System.out.println("\nSavingsAccount Tests");
        sa.deposit(1000);
        sa.withdraw(4500);   // Allowed: 5000+1000-4500 = 1500 >= 1000
        sa.withdraw(700);    // Denied: 1500-700 = 800 < 1000
        sa.withdraw(-100);   // Invalid
        sa.deposit(-50);     // Invalid

        System.out.println("\nCurrentAccount Tests");
        ca.deposit(500);
        ca.withdraw(4000);   // Allowed: balance=3500, overdraft=2000, total=5500 > 4000
        ca.withdraw(2000);   // Denied: balance=-500, overdraft=2000, available=1500 < 2000
        ca.withdraw(0);      // Invalid

        System.out.println("\nFinal State");
        sa.display();
        ca.display();
    }
}
