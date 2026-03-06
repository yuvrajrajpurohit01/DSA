import java.util.Scanner;
import java.util.*;

public class yesoryes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            if (s.toLowerCase().equals("yes")){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}