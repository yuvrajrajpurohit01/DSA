import java.util.*;
public class divison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i<t ; i++){
            int r = sc.nextInt();
            if(r<=1399){
                System.out.println("Division 4");
            }
            else if(r>= 1400 && r<= 1599){
                System.out.println("Division 3");
            }
            else if(r>= 1600 && r<= 1899){
                System.out.println("Division 2");
            }
            else{
                System.out.println("Division 1");
            }
        }
    }
}