import java.util.*;
public class game23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count1 = 0;
        int count2 = 0;
        while(n<m){
            if( n<= m){
                count1++;
            }
            n = n*2;
        }
        while (n<m){
            if(n<=m){
                count2++;
            }
            n=n*3;
        }
        if(count1>count2){
            System.out.println(count2);
        }
        else if (count2 > count1){
            System.out.println(count1);
        }
        else{
            System.out.println(-1);
        }
    }
}
