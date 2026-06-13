abstract class Account {

    private double balance;

    Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    abstract void interest();
}

class SavingsAccount extends Account {

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void interest() {
        System.out.println("Savings Interest = 6%");
    }
}

class CurrentAccount extends Account {

    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    void interest() {
        System.out.println("Current Interest = 2%");
    }
}

public class pillars2 {

    public static void main(String[] args) {

        Account a;

        a = new SavingsAccount(5000);

        System.out.println(a.getBalance());

        a.interest();

        a = new CurrentAccount(10000);

        System.out.println(a.getBalance());

        a.interest();
    }
}