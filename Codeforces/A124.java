import java.util.*;

public class A124 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = n-(a+b);
        int ans = res+b;
        int c = b+1;
        if(ans<c) System.out.println(ans);
        else System.out.println(c);
    }
}