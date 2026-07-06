import java.util.*;

public class C1744 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String c = sc.next();
            String seq = sc.next();

            if(c.charAt(0) == 'g'){
                System.out.println(0);
                continue;
            }

            String doubled = seq + seq;
            int nextGreen = -1;
            int ans = 0;

            for (int i = doubled.length() - 1; i >= 0; i--) {
                if (doubled.charAt(i) == 'g') {
                    nextGreen = i;
                }

                if (i < n && doubled.charAt(i) == c.charAt(0)) {
                    ans = Math.max(ans, nextGreen - i);
                }
            }

            System.out.println(ans);
        }
    }
}