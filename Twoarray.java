import java.util.Scanner;

public class Twoarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of classrooms: ");
        int m = sc.nextInt();

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter marks for class " + i + " student " + j + ": ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Markssss:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}