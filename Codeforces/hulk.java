import java.util.Scanner;

public class hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res = "";
           for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                res += "I hate ";
            } 
            else {
                res += "I love ";
            }

            if (i == n) {
                res += "it";
            } 
            else {
                res += "that ";
            }
        }
        System.out.println(res);
        }
    }
