import java.util.*;

public class odddiv {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i<t ; i++){
            long n = sc.nextLong();
            while(n%2 == 0){
                n /= 2;
            }
            if(n>1){System.out.println("Yes");}
            else {
                System.out.println("No");
            }    
        }
            
   }
            
            
}