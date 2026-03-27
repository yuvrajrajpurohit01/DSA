import java.util.*;
public class stringtask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        s1 = s1.toLowerCase();

        char[] arr = s1.toCharArray();

        String result = "";
      
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]!='a' && arr[i]!='e' && arr[i]!='i' && arr[i]!='o' && arr[i]!='u'&& arr[i]!='y' ){
                result = result + "." + arr[i];
            };
            
        }
        System.out.println(result);
    }
}
