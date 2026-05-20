import java.util.*;

public class optimalpurchase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();

            long groupCost = Math.min(3 * a, b);

            long ans = (n / 3) * groupCost + (n % 3) * a;

            // Sometimes buying one extra group is cheaper
            ans = Math.min(ans, ((n + 2) / 3) * b);

            System.out.println(ans);
        }
    }
}