import java.util.Scanner;
public class avg{
    public static void main(String[] args){
        Scanner var1 = new Scanner(System.in);
        System.out.println("Enter Marks In Java");
        int num1 = var1.nextInt();
        System.out.println("Enter Marks In CPP");
         int num2 = var1.nextInt();
        System.out.println("Enter Marks In PYTHON");
         int num3 = var1.nextInt();
        System.out.println("Enter Marks In JAVASCRIPT");
         int num4 = var1.nextInt();
        
        System.out.println("Enter Marks In KOTLIN");
         int num5 = var1.nextInt();

         float average = (num1+num2+num3+num4+num5)/5;
         System.out.println("Average : "+ average);
         var1.close();



    }

}
