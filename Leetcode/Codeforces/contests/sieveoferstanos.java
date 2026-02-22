import java.util.*;

public class sieveoferstanos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            boolean present = false;
            for (int j = 0; j < n; j++) {
                int elements = sc.nextInt();
                if (elements == 67) {
                    present = true;
                }

            }
            if (present) {
                System.out.println("Yes");
            } else {
                System.out.println("NO");
            }
        }

    }
}
