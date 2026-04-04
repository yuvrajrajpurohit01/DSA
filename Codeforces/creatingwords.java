import java.util.*;
public class creatingwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i<t ; i++){
            String s1 =sc.next();
            String s2 =sc.next();

            String r1 = s2.charAt(0) + s1.substring(1);
            String r2 = s1.charAt(0) + s2.substring(1);
            String r3 = r1 + " " + r2;
            System.out.println(r3);
        }
    }
}
