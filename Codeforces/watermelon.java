import java.util.Scanner;
import java.util.*;
public class watermelon {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int y = sc.nextInt();
        if((y>2) && (y%2==0)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
