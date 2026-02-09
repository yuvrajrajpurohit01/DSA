import java.util.*;


public class lawnmower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            long n = sc.nextInt();
            long w = sc.nextInt();
            long answer = n - (n/w);
            System.out.println(answer);
        }
    } 
}