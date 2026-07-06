import java.util.*;

public class B1343 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> arr1 = new ArrayList<>();
            ArrayList<Integer> arr2 = new ArrayList<>();
            int sum1 = 0;
            int sum2 = 0;
            int half = n / 2;

            
            for (int i = 2; i <= n; i += 2) {
            arr1.add(i);
            sum1 += i;
            }

            for (int i = 1; arr2.size() < half - 1; i += 2) {
            arr2.add(i);
            sum2 += i;
            }

            int res = sum1 - sum2;
            arr2.add(res);
            
            if (n%4 == 0) {
                if(sum1 == (sum2 + res)){
                System.out.println("YES");
                List<Integer> combinedList = new ArrayList<>(arr1);
                combinedList.addAll(arr2);

                for (int x : combinedList) {
                    System.out.print(x + " ");
                    }
                    System.out.println();
                }
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}