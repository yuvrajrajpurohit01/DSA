import java.util.*;
public class lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int lucky = 0;
        for(int i = 0 ; i < t ; i++){
            String s = sc.next();
            int n1 = 0;
            int n2 = 0;
            for(int j = 0 ; j < 3 ; j++){
                n1 += s.charAt(j) - '0';
            }
            for(int k = 3 ; k < 6 ; k++){
                n2 += s.charAt(k) - '0';
            }
            if((n1-n2) == 0 ){
            System.out.println("Yes");
            }
            else{
            System.out.println("No");
            }
        }
        
    }
}
