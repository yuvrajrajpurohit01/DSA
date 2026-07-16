import java.util.*;

public class B1703 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            String s = sc.next();
            int[] freq = new int[26];
            int cnt = 0;
            for (int i = 0; i <= s.length()-1 ; i++) {
                if(freq[s.charAt(i) -'A'] == 0){
                    cnt += 2;
                    freq[s.charAt(i)-'A']++;
                }
                else if (freq[s.charAt(i)-'A'] != 0) {
                    cnt++;
                    freq[s.charAt(i)-'A']++;
                }
            }
            System.out.println(cnt);

        }
    }
    
}