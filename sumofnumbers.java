import java.util.Scanner;
public class sumofnumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR FIRST NUMBER : ");
        int num1 = sc.nextInt();
        System.out.print("ENTER YOUR SECOND NUMBER : ");
        int num2 = sc.nextInt();
        int Num =  num1 + num2;
        System.out.println("sum is : "+ Num);
        sc.close();

    }
}

