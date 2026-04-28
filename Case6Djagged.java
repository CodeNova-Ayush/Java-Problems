public class Case6Djagged{
    public static void main(String[] args) {

        int[][][] a = new int[2][][];

        a[0] = new int[2][];
        a[1] = new int[3][];

        a[0][0] = new int[5];
        a[0][1] = new int[3];

        a[1][0] = new int[2];
        a[1][1] = new int[4];
        a[1][2] = new int[3];

        a[0][0][0] = 1000;
        a[0][0][1] = 200;

        a[1][1][2] = 5000;

        for(int i = 0; i < a.length; i++) {
            System.out.println("School " + i);

            for(int j = 0; j < a[i].length; j++) {
                System.out.print(" Class " + j + ": ");

                for(int k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}