import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements:");

        for (int i = 0; i < n; i++) {

            boolean isDuplicate = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                continue;
            }

            int count = 0;

            for (int j = i + 1; j < n; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > 0) {
                System.out.println(arr[i]);
            }
        }

        sc.close();
    }
}