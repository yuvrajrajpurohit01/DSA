import java.util.*;

public class B1873 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i<n ; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            arr[0] += 1;
            int prod = 1;
            for (int j = 0; j < arr.length; j++) {
                prod *= arr[j];
            }
            System.out.println(prod);
        }
    }
}