import java.util.*;

public class WaytoolongWords {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] array1 = new String [n];
        int j = 0;
        while (n!=0){
            String word = sc.next();
            array1[j] = word;
            j++;
            n--;
        }
        for (int i = 0 ; i<array1.length ; i++){
            int num = array1[i].length();
            if(num >10){
                System.out.println(array1[i].charAt(0) +""+num+""+array1[i].charAt(array1[i].length()-1));
            }
            else {
                System.out.println(array1[i]);
            }

        }
    
           

    }
}
