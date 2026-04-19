import java.util.*;

public class maximumincrease {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] ans = new int[t];
        for(int i = 0 ; i< t ; i++){
            ans[i] = sc.nextInt();
        }
        int count = 1;
        int ans1 = 1;
        for(int j = 1 ; j<ans.length ; j++){
            if(ans[j]>ans[j-1]){
                count++;
            }
            else{
                count = 1;
            }
            ans1 = Math.max(ans1,count);
        }
        System.out.println(ans1);
    }
}