import java.util.*;

public class A2126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int dig = sc.nextInt();
            int s = Integer.MAX_VALUE;
            while (dig>0) {
                s = Math.min(dig%10 , s);
                dig /= 10;
            }
            System.out.println(s);

        }
    }
}
