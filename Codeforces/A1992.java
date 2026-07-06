import java.util.*;

public class A1992 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int max = 0;
            int cnt = 0;
            int[] arr = new int[3];
            for (int i = 0; i < arr.length ; i++) {
                arr[i] = sc.nextInt();
            }
            while (cnt<5) {
                Arrays.sort(arr);
                arr[0] += 1;
                cnt++;
            }
            max += arr[0]*arr[1]*arr[2];
            System.out.println(max);
        }
    }
}