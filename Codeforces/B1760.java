import java.util.*;

public class B1760 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            int res = arr[n-1] - 'a' + 1;
            System.out.println(res);

        }
    }
}