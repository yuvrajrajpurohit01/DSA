import java.util.*;
import java.io.*;

public class A1805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int xorAll = 0;
            for (int i = 0; i < n; i++) {
                xorAll ^= Integer.parseInt(st.nextToken());
            }
            
            if (n % 2 == 1) {
                sb.append(xorAll).append("\n");
            } else {
                sb.append(xorAll == 0 ? 0 : -1).append("\n");
            }
        }
        
        System.out.print(sb);
    }
}