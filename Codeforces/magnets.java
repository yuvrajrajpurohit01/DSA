import java.util.Scanner;

public class magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        int r = 0;
        for(int i = 0 ; i<n ; i++){
            int m = sc.nextInt();
            if (m!=r){
                r = m;
                count++;
            }
        }
        System.out.println(count);
    }
}
