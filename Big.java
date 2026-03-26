import java.util.Scanner;
import java.math.BigDecimal;

public class Big {

    public static void main(String[] args) {

        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter first number:");
        BigDecimal a = num1.nextBigDecimal();

        Scanner num2 = new Scanner(System.in);
        System.out.println("Enter second number");
        BigDecimal b = num2.nextBigDecimal();

        BigDecimal sub = a.subtract(b);

        System.out.println("Sub = " + sub);
    }
}