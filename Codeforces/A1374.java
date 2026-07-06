import java.util.*;

public class A1374 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long x = sc.nextInt();
            long y = sc.nextInt();
            long n = sc.nextInt();
            long ans = n - (n % x) + y;
            if(ans > n) ans -= x;
            System.out.println(ans);
        }
    }
}