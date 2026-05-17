class BankAccount {

    private String accountHolder;
    private double balance;

    public void setAccountHolder(String name) {
        this.accountHolder = name;
    }

    public void setBalance(double balance) {
        if(balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative! ❌");
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }
}

public class Code1_BankAccount {
    public static void main(String[] args) {

        BankAccount b = new BankAccount();
        b.setAccountHolder("Rahul");
        b.setBalance(5000);
        b.setBalance(-100);

        System.out.println(b.getAccountHolder());
        System.out.println(b.getBalance());
    }
}
