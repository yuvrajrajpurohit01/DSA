import java.util.*;
public class bearandbigbrthr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for (int i = 0 ; i<b;i++){
            if (a<=b){
                a=a*3;
                b=b*2;
                count++;
            }
        }
        System.out.println(count);
    }
}