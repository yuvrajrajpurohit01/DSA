import java.util.Scanner;

public class vladand5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i < t ; i++){
            String s = sc.next();
            int countA = 0;
            int countB = 0;
            for (int j = 0 ; j<s.length(); j++ ){
                if (s.charAt(j)=='A'){
                    countA++;
                }
                else{
                    countB++;
                }
            }
            if (countA>countB){System.out.println("A");}
            else{System.out.println("B");}
        }

    }
}
