import java.util.*;

public class c1878 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i<t ;i++){
        long n = sc.nextLong();
        long k = sc.nextLong();
        long x = sc.nextLong();
        long minsum = k*(k+1)/2;
        long sum = k*(2*n-k+1);
        long maxsum = sum/2;
        
        if(x>=minsum && x<=maxsum){
            System.out.println("YES");
            }
            
        else{
            System.out.println("NO");
            }

        }  
    }
}
