import java.util.*;

public class B2044{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            String b ="";
            for(int i = s.length()-1 ;i>=0 ; i--){
                if(s.charAt(i)=='q') b += 'p';
                if(s.charAt(i)=='p') b += 'q';
                if(s.charAt(i)=='w') b +='w';
            }
            System.out.println(b);

        }
    }
}