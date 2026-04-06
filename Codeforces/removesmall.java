import java.util.*;
public class removesmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i<t ; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int count = 0;
            for(int j = 0 ; j<n ; j++){
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            for(int k = 1 ; k < arr.length ; k++){
                if(arr[k] - arr[k-1] == 1 || arr[k] - arr[k-1] == 0){
                    n--;
                }
            }
            if (n==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
