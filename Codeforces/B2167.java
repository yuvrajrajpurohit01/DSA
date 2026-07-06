import java.util.*;

public class B2167 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String t = sc.next();
            int[] freq1 = new int[26];
            int[] freq2 = new int[26];

            for (int i = 0; i < n; i++) {
                freq1[s.charAt(i) - 'a']++;
                freq2[t.charAt(i) - 'a']++;
            }
            boolean same = true;

            for (int j = 0; j < 26; j++) {
                if (freq1[j] != freq2[j]) {
                    same = false;
                    break;
                }
            }

            if (same) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            
        }
    }
}