import java.util.*;

public class A80 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int nextPrime = n + 1;

while (true) {
    boolean prime = true;

    for (int i = 2; i * i <= nextPrime; i++) {
        if (nextPrime % i == 0) {
            prime = false;
            break;
        }
    }

    if (prime) break;
    nextPrime++;
}

if (nextPrime == m)
    System.out.println("YES");
else
    System.out.println("NO");
    }
}