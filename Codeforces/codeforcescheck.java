import java.util.*;


public class codeforcescheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s = "codeforces";
        for (int i = 0; i < t; i++) {
            String s1 = sc.next();
            char ch = s1.charAt(0);
            
            if (s.indexOf(ch) != -1){
            System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            }
        }
    }
