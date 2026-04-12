import java.util.*;
public class chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i < t ; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            char[] ans = s.toCharArray();
            Arrays.sort(ans);
            if((n-k) == 1){
                System.out.println("YES");
                continue;
            }
            else if ((n-k) % 2 == 0) {
                int res = 0;
                for(int j = 1 ; j<ans.length-k ; j++){
                    if(ans[j-1]==ans[j]){
                        res += 1;
                    }
                    else{
                        res += 0;
                    }
                }
                if(res>n/2){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{

            }

    }
}
}
