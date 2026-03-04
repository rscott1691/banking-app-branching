public class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(String owner) {
        this.owner = owner;
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }
}
