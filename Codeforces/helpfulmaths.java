import java.util.*;

public class helpfulmaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.next().split("\\+");
        Arrays.sort(arr);
        System.out.println(String.join("+", arr));
    }
}