import java.util.*;
public class oddset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] ans = new int[2*n];
            int e =0; int odd = 0;
            for (int j = 0; j < ans.length ; j++) {
                ans[j] = sc.nextInt();
                if(ans[j]%2 == 0)e++;
                else odd++;
            }
            if(e==odd){System.out.println("Yes");}
            else{System.out.println("No");}            
        }
    }
}
