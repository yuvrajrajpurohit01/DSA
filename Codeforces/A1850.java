    import java.util.*;

    public class A1850 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-->0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                int ab =a+b;
                int bc = b+c;
                int ac = a+c;

                int cnt = 0;
                if(ab>=10){
                    cnt++;
                }
                if(bc>=10){
                    cnt++;
                }
                if(ac>=10){
                    cnt++;
                }

                if(cnt>=1){
                    System.out.println("YES");
                }
                else{
                    System.out.println("No");
                }
            }
        }
    }