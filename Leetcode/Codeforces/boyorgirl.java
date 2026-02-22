import java.util.*;
public class boyorgirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt[] = new int[256];
        int count = 0;
        
        //frequency
        for (int i=0;i<s.length();i++){
           cnt[s.charAt(i)]++;
        }
        
        //counting the no of distincts.
        for (int i = 0;i<256 ; i++){
            if (cnt[(i)]>0){
                count++;
            }
        }
        if((count % 2) == 0 ){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}
