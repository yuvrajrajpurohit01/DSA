import java.util.*;
public class A935 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            int remaining = n - i;
            if(remaining % i == 0){
                cnt++;
            }

        }
        System.out.println(cnt);
    }
}
