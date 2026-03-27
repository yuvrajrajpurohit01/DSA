import java.util.*;
public class expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = 0;
        int max = 0;
        int e1 = a*b*c;
        max = Math.max(max,e1);
        int e2 = a+b+c;
        max = Math.max(max,e2);
        int e3 = (a+b)*c;
        max = Math.max(max, e3);
        int e4 = a*(b+c);
        max= Math.max(max, e4);
        int e6 = (a*b)+c;
        max = Math.max(max,e6);
        int e7 = a+(b*c);
        max = Math.max(max,e7);
        System.out.println(max);

        
    }
}
