import java.util.Scanner;

public class darraymarks {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of classrooms: ");
        int row = s.nextInt();

        System.out.print("Enter number of students: ");
        int col = s.nextInt();

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            System.out.println("\nEnter marks for Classroom " + (i + 1));
            for (int j = 0; j < col; j++) {
                System.out.print("Student " + (j + 1) + ": ");
                arr[i][j] = s.nextInt();
            }
        }

        System.out.println("\n===== MARKS =====");

        for (int i = 0; i < row; i++) {
            System.out.println("\nClassroom " + (i + 1) + ":");
            for (int j = 0; j < col; j++) {
                System.out.println("Student " + (j + 1) + " : " + arr[i][j]);
            }
        }

        s.close();
    }
}