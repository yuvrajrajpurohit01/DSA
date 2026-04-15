import java.util.*;
public class dieroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int W = sc.nextInt();
        int max = Math.max(Y, W);
        int count = (6 - max)+1 ;
        int total = 6;
        int g = gcd(count,total);
        System.out.println((count/g)+"/"+(total/g));
    }
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
