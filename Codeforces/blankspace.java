import java.util.*;

public class blankspace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i<t ; i++){
            int n = sc.nextInt();
            int count = 0;
            int prev = 0;
            int[] arr = new int[n];
            for(int j = 0 ; j<n ; j++){
                arr[j] = sc.nextInt();
            }
            for(int k = 0; k < n; k++){
                if(arr[k] == 0){
                    count++;
                    prev = Math.max(prev, count);
                } else {
                    count = 0;
                }
            }
            System.out.println(prev);
        }
    }
}