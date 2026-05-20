import java.util.*;

public class A1834 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int odd = 0;
            int op = 0;
            int count = 0;
            for(int i = 0 ; i<n ; i++){
                arr[i] = sc.nextInt();
                count += arr[i];
                if(arr[i] == -1){
                    odd++;
                }
            }
            while(count<0 || odd%2 != 0){
                count+=2;
                odd--;
                op++;
            }
        System.out.println(op);
        }
    }
}