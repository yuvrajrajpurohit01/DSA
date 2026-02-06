import java.util.*;

public class divproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int moves = (b - (a % b)) % b;
            System.out.println(moves);
        }
    }
}