import java.util.*;

public class ilyaba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = Integer.parseInt(s);

        if(n>=0){
            System.out.println(n);
        }

        else{String s1 = s.substring(0,s.length()-2) + s.charAt(s.length()-1);
        String s2 = s.substring(0,s.length()-1);
        
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);

        System.out.println(Math.max(n,Math.max(n1, n2)));
        }
    }    
}
