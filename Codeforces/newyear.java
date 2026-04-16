import java.util.*;

public class newyear {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i = 0; i < 3; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int median = arr[1]; 
        int ans = Math.abs(arr[0] - median) + Math.abs(arr[1] - median) + Math.abs(arr[2] - median);
        System.out.println(ans);
    }
}