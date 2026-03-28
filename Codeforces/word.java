import java.util.*;
public class word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count1 = 0;
        int count2 = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(Character.isUpperCase(s.charAt(i))){
                count1++;
            }
            else{
                count2++;
            }
        }
        if(count1>count2){
            s = s.toUpperCase();
        }
        else{
            s = s.toLowerCase();
        }
        System.out.println(s);
    }
}
