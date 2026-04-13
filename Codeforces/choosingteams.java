import java.util.*;

public class choosingteams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for(int i = 0 ; i<n ; i++){
            int x = sc.nextInt();
            if((5-x)>k){
                count++;
            }
        }
    }
}
