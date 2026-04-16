import java.util.*;

public class vanyacube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1, count = 0;

        while (n >= (i * (i + 1)) / 2) {
            n -= (i * (i + 1)) / 2;
            count++;
            i++;
        }

        System.out.println(count);
    }
}