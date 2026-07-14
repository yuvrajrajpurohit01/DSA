import java.util.*;

public class A2014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            int cnt = 0;
            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                if(arr[i]>= k){
                    sum += arr[i];
                }
                else if(sum>0 && arr[i] == 0){
                    sum-=1;
                    cnt++;
                }
            }

            System.out.println(cnt);

        }
    }
    
}