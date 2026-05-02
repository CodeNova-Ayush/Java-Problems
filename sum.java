import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = 2, r = 2, c = 2;
        int[][][] arr = new int[l][r][c];

        System.out.println("Enter elements:");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        int sum = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    sum += arr[i][j][k];
                }
            }
        }

        System.out.println("Total Sum: " + sum);

        sc.close();
    }
}