import java.util.*;
public class lovestory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            String s1 = "codeforces";
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s.toCharArray();
            int count = 0;
            for (int j = 0; j < arr2.length ; j++) { 
                if(arr2[j] != arr1[j]){
                count++;
                }
            }
            System.out.println(count);
        }
    }
}
