import java.util.Scanner;

public class INDEX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        char first = name.charAt(0);
        char last = name.charAt(name.length()-1);
        
        
        System.out.println("first character:" + first);
        System.out.println("Hello : " + last);

        sc.close();
    }
}