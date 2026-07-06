import java.util.*;
public class C1915 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextInt();
            long sum = 0;
            for(int i = 0 ; i<n ; i++){
                sum += sc.nextLong();
            }
    
            long root = (long) Math.sqrt(sum);
            while (root * root < sum) root++;
            while (root * root > sum) root--;

            if (root * root == sum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
