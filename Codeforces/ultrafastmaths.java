import java.util.*;
public class ultrafastmaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        StringBuilder res = new StringBuilder();
        for (int i = 0 ; i < s1.length(); i++){
            if (s1.charAt(i) == s2.charAt(i)){
                res.append("0");
            }
            else{
                res.append("1");
            }
        }
        System.out.println(res.toString());
    }
}
