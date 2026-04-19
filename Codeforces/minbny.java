import java.util.*;

public class minbny {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i<t ; i++){
            int h = sc.nextInt();
            int m = sc.nextInt();
            int ans = 1440 - (h*60) - m;
            System.out.println(ans); 
        }
    }
   
}