import java.util.*;
public class A1729 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int time1 = Math.abs(a-1);
            int time2 = Math.abs(b-c) + Math.abs(c-1);
            if(time1>time2){
                System.out.println(2);
            }
            if(time2>time1){
                System.out.println(1);
            }
            if(time1 == time2){
                System.out.println(3);
            }
        }
    }
}
