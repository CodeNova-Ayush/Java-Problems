import java.util.Scanner;

 public class Case3D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sch = sc.nextInt();  
        int c = sc.nextInt();   
        int stu = sc.nextInt();  

        int[][][] arr = new int[sch][c][stu];

        for(int i = 0; i < sch; i++) {
            for(int j = 0; j < c; j++) {
                for(int k = 0; k < stu; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        for(int i = 0; i < sch; i++) {
            System.out.println("School " + i);

            for(int j = 0; j < c; j++) {
                System.out.print("Class " + j + ": ");

                for(int k = 0; k < stu; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }

            System.out.println();
        }

    }
}