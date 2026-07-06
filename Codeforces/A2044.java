    import java.util.*;

    public class A2044 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int cnt = 0;
                for (int i = 1; i < n; i++) {
                    for (int j = 1; j < n; j++) {
                        if((i+j) == n){
                            cnt++;
                        }
                    }
                }
                System.out.println(cnt);
            }
        }
    }