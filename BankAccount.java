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
        if(amount <= balance)
        {
            balance -= amount;
        }
        else
        {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

//added by kate
    public void printSummary() {
System.out.println("Account Owner: " + owner);
System.out.println("Balance: $" + balance);
}
    
}
