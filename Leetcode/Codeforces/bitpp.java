import java.util.*;
public class bitpp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int X = 0;
        for (int i = 0 ; i<t;i++){
            String op = sc.next();
            if (op.equals("++X")){
                ++X;
            }
            else if (op.equals("--X")){
                --X;
            }
            else if (op.equals("X++")){
                X++;
            }
            else if(op.equals("X--")){
                X--;
            }
        }
        System.out.println(X);
    }
}
