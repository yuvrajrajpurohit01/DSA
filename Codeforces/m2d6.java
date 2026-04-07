import java.util.*;

public class m2d6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i<t ; i++){
            int n = sc.nextInt();
            int count = 0;
            while (n > 1) {
                
                if (n%6 == 0){
                count++;
                n = n/6;
            }
            else if (n % 3 == 0){
                n = n*2;
                count++;
            }
            else{
                count = -1;
                break;
            }
            }
            System.out.println(count);
        }
    }
}