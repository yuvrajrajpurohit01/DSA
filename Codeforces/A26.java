import java.util.*;
public class A26 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;


        for (int num = 2; num <= n; num++) {
            ArrayList<Integer> a = new ArrayList<>();

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    a.add(i);
                }
            }

            int cnt = 0;

            for (int j = 0; j < a.size(); j++) {
                int as = 0;

                for (int k = 2; k < a.get(j); k++) {
                    if (a.get(j) % k == 0) {
                        as++;
                    }
                }

                if (as == 0 && a.get(j) > 1) {
                    cnt++;
                }
            }

            if (cnt == 2) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
