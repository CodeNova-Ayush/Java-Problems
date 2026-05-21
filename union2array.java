import java.util.HashSet;

public class union2array {

    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {2, 3, 4};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }

        System.out.println("Union Elements:");

        for (int x : set) {
            System.out.print(x + " ");
        }
    }
}