    import java.util.Scanner;
    import java.util.*;

    public class stonesonthetable {
        
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int count = 0 ;
        for (int i = 1 ; i < n ; i++){
            if (s.charAt(i-1) == s.charAt(i)){
                count++;
            }
        }   
        System.out.println(count);
        }
    }
