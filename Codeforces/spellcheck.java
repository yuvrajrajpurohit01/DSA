import java.util.*;
public class spellcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s1 = "Timur";
        char[] arr = s1.toCharArray();
        Arrays.sort(arr);
        for(int i = 0 ; i<t ; i++){
            int n = sc.nextInt();
            String s = sc.next();
            char[] arr2 = s.toCharArray();
            Arrays.sort(arr2);
            if (n!=5) {
                System.out.println("NO");
                continue;
            }
            if(Arrays.equals(arr, arr2)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
