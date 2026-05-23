import java.util.*;

public class A584 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        
        if (n == 1 && t == 10) {
            System.out.println(-1);
            return;
        }

        
        if (t == 10) {
            System.out.print(1);
        } else {
            System.out.print(t);
        }

        
        for (int i = 1; i < n; i++) {
            System.out.print(0);
        }
    }
    
}