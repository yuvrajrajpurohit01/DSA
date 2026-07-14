import java.util.*;

public class B1971 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            boolean same = true;
            
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != s.charAt(0)) {
                    same = false;
                    break;
                }
            }

            if (same) {
                System.out.println("NO");
                continue;
            }
            char[] arr = s.toCharArray();

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != arr[0]) {
                    char temp = arr[0];
                    arr[0] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }

            String res = new String(arr);

            System.out.println("YES");
            System.out.println(res);
        }
    }
}