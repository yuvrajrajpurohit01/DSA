import java.util.*;

public class A577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int cnt = 0;
        
        for(int i = 2 ; i < x ; i++){
            if(x%i == 0){
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}
