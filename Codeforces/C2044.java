import java.util.*;
public class C2044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int m = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            int total = m*2;
            int row1 = Math.min(a, m);
            int row2 = Math.min(b, m);

            int ans = row1 + row2;

            int remaining = total - ans;

            ans += Math.min(c, remaining);

            System.out.println(ans);
            
            

        }
    }
}
