import java.util.*;

public class dsa1 {

    public static ArrayList<Integer> findEvenOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        HashSet<Integer> used = new HashSet<>();

        for(int i = 0; i < arr.length; i++) {

            if(map.get(arr[i]) % 2 == 0 && !used.contains(arr[i])) {

                ans.add(arr[i]);

                used.add(arr[i]);
            }
        }

        if(ans.size() == 0) {

            ans.add(-1);
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> result = findEvenOccurrences(arr);

        System.out.println("Elements with even occurrences:");

        for(int x : result) {

            System.out.print(x + " ");
        }

        sc.close();
    }
}