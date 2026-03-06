import java.util.*;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        if (s.length() != t.length()) {
            System.out.println("NO");
            return;
        }

        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(s.length() - 1 - i)) {
                cnt++;
            }
        }

        if (cnt == s.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}