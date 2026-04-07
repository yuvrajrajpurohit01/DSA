import java.util.*;

public class football1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // fix input issue

        String res = "";

        // Take input
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            res += s;
        }

        // Convert to char array
        char[] arr = res.toCharArray();

        int[] freq = new int[26];

        // Count frequency
        for(char ch : arr){
            freq[ch - 'A']++;
        }

        // Find max
        int max = 0;
        char result = 'A';

        for(int j = 0; j < 26; j++){
            if(freq[j] > max){
                max = freq[j];
                result = (char)(j + 'A');
            }
        }

        System.out.println(result);
    }
}