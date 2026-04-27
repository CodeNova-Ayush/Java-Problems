import java.util.Scanner;

public class case4D{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of containers: ");
        int c = sc.nextInt();

        System.out.print("Enter number of blocks: ");
        int b = sc.nextInt();

        System.out.print("Enterr number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();

        int[][][][] arr = new int[c][b][r][col];

        for(int i = 0; i < c; i++) {
            for(int j = 0; j < b; j++) {
                for(int k = 0; k < r; k++) {
                    for(int l = 0; l < col; l++) {
                        System.out.print("Enter value: ");
                        arr[i][j][k][l] = sc.nextInt();
                    }
                }
            }
        }

        System.out.println("\nThe markss :\n");

        // output
        for(int i = 0; i < c; i++) {
            System.out.println("Container " + i);

            for(int j = 0; j < b; j++) {
                System.out.println(" Block " + j);

                for(int k = 0; k < r; k++) {
                    System.out.print("  Row " + k + ": ");

                    for(int l = 0; l < col; l++) {
                        System.out.print(arr[i][j][k][l] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}