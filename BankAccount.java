class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("After Deposit : " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("After Withdrawal : " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance() {
        System.out.println("Final Balance : " + balance);
    }

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(101, "Indhu", 10000);

        System.out.println("Initial Balance : " + b1.balance);

        b1.deposit(5000);
        b1.withdraw(3000);
        b1.displayBalance();
    }
}