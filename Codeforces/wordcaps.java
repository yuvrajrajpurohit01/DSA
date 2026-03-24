import java.util.*;

public class wordcaps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        s1 = s1.substring(0,1).toUpperCase() + s1.substring(1);
        System.out.println(s1);
    
    }
}