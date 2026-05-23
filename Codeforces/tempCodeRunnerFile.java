import java.util.*;

public class A584 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long t = sc.nextInt();
        int lower = 10**n;
        int higher = 10**(n+1);
        for (int i = lower; i < higher ; i++) {
            if(i%t == 0){
                System.out.println(i);
                break;
            }
        }
    }
    
}