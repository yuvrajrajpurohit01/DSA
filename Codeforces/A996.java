import java.util.*;

public class A996 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long cnt = 0;
        while (n>0) {
            if(n>=100){
                cnt += n/100;
                n = n%100;
            }
            if(n>=20){
                cnt += n/20;
                n = n % 20;
            }
            if(n>=10 && n<20){
                cnt += n/10;
                n = n%10;
            }
            if(n>=5 && n<10){
                cnt += n/5;
                n = n%5;
            }
            if (n<5 && n>= 1){
                cnt += n/1;
                n = n%1;
            }
        }
        System.out.println(cnt);
    }
}