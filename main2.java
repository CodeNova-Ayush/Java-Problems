import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        float s1 = sc.nextFloat();

        System.out.print("Enter marks of Subject 2: ");
        float s2 = sc.nextFloat();

        System.out.print("Enter marks of Subject 3: ");
        float s3 = sc.nextFloat();

        System.out.print("Enter marks of Subject 4: ");
        float s4 = sc.nextFloat();

        System.out.print("Enter marks of Subject 5: ");
        float s5 = sc.nextFloat();

        float total = s1 + s2 + s3 + s4 + s5;
        float percentage = (total / 500) * 100;

        System.out.println("Percentage = " + percentage + "%");

        sc.close();
    }
}