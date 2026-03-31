import java.util.*;
public class football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char[] s = n.toCharArray();
        int count = 0;
        int value = 0;
        for(int i = 1 ; i < s.length ; i++){
            if (s[i-1] == s[i]){
                count++;
                if(count >= 6){
                value++;
                }
            }
            else{
                count = 0;
            }
        }
        if(value >= 1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
    }
}
