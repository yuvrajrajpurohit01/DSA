import java.util.*;
public class myfsortprob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int[] arr = new int[2];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        }
        

    }
}
