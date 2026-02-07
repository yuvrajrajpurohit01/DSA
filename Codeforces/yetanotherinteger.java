import java.util.Scanner;

public class yetanotherinteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i =0 ; i < t ; i++){
            long a = sc.nextInt();
            long b = sc.nextInt();
            long dif = Math.abs(b-a);
            long k = (dif+9)/10;
            System.out.println(k);
        } 
    }
}
