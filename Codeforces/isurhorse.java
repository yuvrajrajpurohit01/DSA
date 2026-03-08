import java.util.*;

public class isurhorse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[4];
        int cnt = 0;

        for (int i = 0; i < 4; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    cnt++;
                    break;  
                }
            }
        }

        System.out.println(cnt);
    }
}