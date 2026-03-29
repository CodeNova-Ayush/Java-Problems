public class frequency {
    public static void main(String[] args) {
        String s = "aabccdeff";

        int[] freq = new int[26]; // for lowercase letters

        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c - 'a']++;
        }

        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(freq[c - 'a'] == 1) {
                System.out.println("First non-repeating: " + c);
                return;
            }
        }

        System.out.println("No non-repeating character");
    }
}