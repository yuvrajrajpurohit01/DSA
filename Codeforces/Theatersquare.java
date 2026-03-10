import java.util.*;

public class Theatersquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();

        long tilesLength = (n + a - 1) / a;
        long tilesWidth = (m + a - 1) / a;

        System.out.println(tilesLength * tilesWidth);
    }
}