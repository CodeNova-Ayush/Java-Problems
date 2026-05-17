abstract class BankAccount {

    private double balance = 5000;

    public double getBalance() {
        return balance;
    }

    abstract void interest();
}

class SavingsAccount extends BankAccount {

    @Override
    void interest() {
        System.out.println("Interest Rate: 6%");
    }
}

public class abstraction {

    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount();

        System.out.println("Balance: " + s.getBalance());

        s.interest();
    }
}