import java.util.HashSet;

public class intersectionof2array {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {2, 4, 6};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        System.out.println("Intersection Elements:");

        for (int i = 0; i < b.length; i++) {

            if (set.contains(b[i])) {
                System.out.print(b[i] + " ");
            }
        }
    }
}