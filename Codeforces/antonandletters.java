import java.util.*;

public class antonandletters{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<s.length() ; i++){
            if (s.charAt(i) != '{' && s.charAt(i) != '}' && s.charAt(i) != ','){
                sb.append(s.charAt(i));
            }
        }
        char[] arr = (sb.toString()).toCharArray();
        Arrays.sort(arr);
        int count = 0;
        if(arr.length>1){
        
        for(int j = 1 ; j<arr.length ; j++){
            if(arr[j] != arr[j-1]){
                count++;
            }
        }
            
        }
        else {
            count = arr.length;
        }
        System.out.println(count);
        
    }
}