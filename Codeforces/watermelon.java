import java.util.Scanner;
import java.util.*;
public class watermelon {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int z = sc.nextInt();
        if((z>2) && (z%2==0)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
