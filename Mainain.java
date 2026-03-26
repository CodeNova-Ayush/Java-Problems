public import java.util.Scanner;

class BankAccount {

    String holderName;
    int accountNumber;
    int balance;

    void getDetails() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        holderName = scan.nextLine();

        System.out.print("Enter Account Number: ");
        accountNumber = scan.nextInt();

        System.out.print("Enter Balance: ");
        balance = scan.nextInt();
    }

    void displayDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Name: " + holderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class Mainain {

    public static void main(String[] args) {

        BankAccount obj = new BankAccount();

        obj.getDetails();
        obj.displayDetails();
    }
} 
  
}
