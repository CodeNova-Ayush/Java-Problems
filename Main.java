import java.util.Scanner;
class OOP_addition {
    int add(int a,int b){
        int sum = a+b;
        return sum;
    }


}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OOP_addition obj = new OOP_addition();
        System.out.print("Enter First Number : ");
        int num1 = sc.nextInt();
         System.out.print("Enter Second  Number : ");
        int num2 = sc.nextInt();

        int result = obj.add(num1,num2);
        if(result>0 && num1>num2)
            System.out.println("Result : " + result);
        else
            System.out.println("Try again viruuuuu");

        
        sc.close();





    }}
