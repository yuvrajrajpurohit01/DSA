import java.util.*;
public class A2149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t ;i++) {
            int n = sc.nextInt();
            int res = 0;
            int[] arr = new int[n];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            for(int k = 0 ; k<arr.length ; k++){
                if(arr[k] == -1){
                    count++;
                }
                else if (arr[k] == 0){
                    res+=1;
                } 
            }
            if(count % 2 != 0){
                res+=2;
            }
            System.out.println(res);
        }
    }
    
}