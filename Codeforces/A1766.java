import java.util.*;
public class A1766 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            String s = String.valueOf(n);
            int digits = s.length();
            int count = 9 *(digits - 1);
            count += (s.charAt(0)-'0');

            System.out.println(count);
        }
    }
}