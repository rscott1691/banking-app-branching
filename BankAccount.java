public class BankAccount {

    private String owner;
    private double balance;

    public void printSummary() {
        System.out.println("Account Owner: " + owner);
        System.out.println("Balance: $" + balance);
    }
    
    public boolean isLowBalance(double threshold) {
        return balance < threshold;
    }
    
    public void applyInterest(double rate) {
        balance += balance * rate;
    }
    
    public void transferTo(BankAccount otherAccount, double amount) {
        if(amount <= balance) {
            balance -= amount;
            otherAccount.deposit(amount);
        } else {
            System.out.println("Transfer failed: insufficient funds.");
        }
    }

    public BankAccount(String owner) {
        this.owner = owner;
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
        }
        else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public void applyInterest(double rate) {
balance += balance * rate;
}
}
