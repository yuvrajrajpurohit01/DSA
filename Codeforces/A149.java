import java.util.*;

public class A149 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.nextLine();
        int[] mon = new int[12];

        for (int i = 0; i < mon.length; i++) {
            mon[i] = s.charAt(i) - '0';
        }

        Arrays.sort(mon);
        int cnt= 0;
        int sum = 0;
        int n = mon.length;
        while(k > sum){
            sum = k - mon[n-1];
            n--;
        }
 

    }
    
}
