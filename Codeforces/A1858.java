import java.util.*;


public class A1858 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int rem = c%2;
            if(a == b && rem == 1){
                System.out.println("First");
            }
            if (a>b && rem == 1) {
                System.out.println("First");
            }
            if (a<b && rem == 1){
                System.out.println("Second");
            }
            if(a==b && rem == 0){
                System.out.println("Second");
            }
            if(a>b && rem == 0){
                System.out.println("First");
            }
            if(a<b && rem == 0){
                System.out.println("Second");
            }
        }
    }
    
}