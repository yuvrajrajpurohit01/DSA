import java.util.Scanner;

public class wrongsubs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int ld=0;
        for(int i =0 ; i < t;i++){
            ld = n % 10;
            if (ld != 0){
                n = n - 1;
            }
            else {
                n = n / 10;
            }
        }
        System.out.println(n);
    }
}
