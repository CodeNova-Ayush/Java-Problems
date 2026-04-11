 
import java.util.Scanner;

class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of stu: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        System.out.println("marksofstudents:");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        sc.close();
    }
} 
    

