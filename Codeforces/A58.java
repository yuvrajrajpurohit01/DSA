import java.util.*;

public class A58 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toLowerCase();
        String t = "hello";
        int cnt = 0;
        for(int i = 0 ; i<s.length() ;i++){
            if(s.charAt(i) == t.charAt(cnt)){
                cnt++;
            }
            if(cnt == t.length()){
                break;
            }
        }
        if(cnt == t.length()){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}