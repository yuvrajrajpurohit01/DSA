import java.util.*;

public class anotherpopcountproblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            
            // Find largest m such that k*(2^m - 1) <= n
            int m = 0;
            while (k * ((1L << (m + 1)) - 1) <= n) {
                m++;
            }
            
            long base     = k * ((1L << m) - 1); // sum if all k numbers = 2^m - 1
            long remaining = n - base;
            long extra    = Math.min(k, remaining >> m); // how many we can upgrade
            
            System.out.println(k * m + extra);


        }
    }
}