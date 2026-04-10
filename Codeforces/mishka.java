import java.util.*;
public class mishka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count1 = 0;
        int count2 = 0;
        for(int i = 0 ; i<n ; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            if(n1>n2){
                count1++;
            }
            if(n2>n1){
                count2++;
            }
        }
        if (count1>count2){
                System.out.println("Mishka");
            }
            if(count1 == count2){
                System.out.println("Friendship is magic!^^");
            }
            if(count1<count2){
                System.out.println("Chris");
            }
    }
}
