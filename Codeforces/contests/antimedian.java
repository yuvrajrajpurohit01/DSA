import java.util.*;

public class antimedian {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for(int i = 0 ; i<t ; i++){
                int n = sc.nextInt();
                int[] arr = new int[n];
                for(int k = 0 ; k<n ;k++){
                    arr[k] = sc.nextInt();
                }
                if(n == 1){
                    System.out.println(1);
                }
                else if (n == 2 ){
                    for (int j = 1 ; j <= n ; j++){
                        System.out.println(2);
                    }
                }
                else{
                    for(int j = 1 ; j <= n ; j++){
                        System.out.println(2);
                    }
                }
            }
        }
}