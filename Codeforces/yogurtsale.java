import java.util.*;

public class yogurtsale {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i<t ;i++){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int minvalue = 0;
            if(n%2 == 0){
    
                minvalue = Math.min(a*n, b*(n/2));
                
            }
            else{
                if((b*(n-1)/2+(a)) < (a*n)){
                    minvalue = b*(n-1)/2 + a;
                }
                else{
                    minvalue = a*n;
                }
            }
            System.out.println(minvalue);
        }
    }
}