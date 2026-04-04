import java.util.*;
public class holiofequal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0 ; i<n ; i++){
            if(arr[i] < arr[n-1]){
                count += arr[n-1] - arr[i];
            }
        }
        System.out.println(count);
    }
}
