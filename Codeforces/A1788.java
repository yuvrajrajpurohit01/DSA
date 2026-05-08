import java.util.*;

public class A1788 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] arr = new int[n];

            int totalTwo = 0;

            for (int i = 0; i < n; i++) {

                arr[i] = sc.nextInt();

                if (arr[i] == 2) {
                    totalTwo++;
                }
            }

            if (totalTwo % 2 != 0) {
                System.out.println(-1);
                continue;
            }

            if (totalTwo == 0) {
                System.out.println(1);
                continue;
            }

            int need = totalTwo / 2;
            int count = 0;

            for (int i = 0; i < n; i++) {

                if (arr[i] == 2) {
                    count++;
                }

                if (count == need) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}