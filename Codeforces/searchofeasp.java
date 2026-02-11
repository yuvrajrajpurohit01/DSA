import java.util.*;
public class searchofeasp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 0 ; i<n ; i++){
            int t = sc.nextInt();
            if (t == 1){
                cnt++;
            }
        }
        if(cnt>=1){
            System.out.println("HARD");
        }
        else{
            System.out.println("EASY");
        }
    }
}
