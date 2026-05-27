import java.util.*;

public class A1296 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int sum = 0;
            boolean even = false;
            boolean odd = false;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                sum += x;

                if (x % 2 == 0)
                    even = true;
                else
                    odd = true;
            }

            if (sum % 2 == 1 || (even && odd)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}