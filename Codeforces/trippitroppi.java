import java.util.*;

public class trippitroppi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i<t ; i++){
            String s1 = sc.nextLine();
            StringBuilder s = new StringBuilder();
            s.append(s1.charAt(0));
            for(int j = 1 ; j<s1.length() ; j++){
                if(s1.charAt(j) == ' ' && j+1 < s1.length()){
                    s.append(s1.charAt(j+1));
                }
            }
            System.out.println(s);
        }
    }
}
