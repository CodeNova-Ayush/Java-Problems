import java.util.Scanner;

public class Case2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt(); 
        int c = sc.nextInt(); 

        int[][] marks = new int[r][c];

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}