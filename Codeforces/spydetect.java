import java.util.*;

public class spydetect {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0 ; i<t ; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j = 0 ; j < n ; j++){
                arr[j] = sc.nextInt();
            }
            for(int k = 1 ; k < arr.length ; k++){
                if(arr[k-1] != arr[k]){

                    if(k == arr.length - 1){
                        System.out.println(k+1);
                        break;
                    }

                    if(arr[k] != arr[k+1]){
                        System.out.println(k+1);
                        break;
                    }
                    else{
                        System.out.println(k);
                        break;
                    }
                }
            }            
        }
    }
}
