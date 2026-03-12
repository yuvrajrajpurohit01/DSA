import java.util.*;

public class restoring3nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[4];
        for (int i = 0; i < 4; i++) {
            array[i] = sc.nextInt(); 
        }
        Arrays.sort(array);
            int a = array[3]-array[2];
            int b = array[3]-array[1];
            int c = array[3]-array[0];
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
