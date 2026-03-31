import java.util.*;

public class antondainik {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] str = s.toCharArray();
        int A = 0;
        int D = 0;
        for(int i = 0 ; i < n ; i++){
            if(str[i] == 'A'){
                A++;
            }
            else{
                D++;
            }
        }
        if(A>D){
            System.out.println("Anton");
        }
        else if(D>A){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }
    }
}