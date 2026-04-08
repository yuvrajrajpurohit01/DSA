import java.util.*;
public class squarestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i<t ; i++){
            String s = sc.next();
            if((s.length()%2) != 0){
                System.out.println("NO");
            }
            else{
                String first = s.substring(0, s.length()/2);
                String second = s.substring(s.length()/2);

                if(first.equals(second)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}
