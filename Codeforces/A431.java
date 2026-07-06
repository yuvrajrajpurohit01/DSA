import java.util.*;
public class A431 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int a4 = sc.nextInt();
        String s = sc.next();

        int calories = 0;

        for (int i = 0; i < s.length() ; i++) {
            if(s.charAt(i) == '1') calories += a1;
            if(s.charAt(i) == '2') calories += a2;
            if(s.charAt(i) == '3') calories += a3;
            if(s.charAt(i) == '4') calories += a4;
        }

        System.out.println(calories);

    }
}
