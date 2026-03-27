import java.util.*;

class waytoolong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = "";
        
        for(int i = 0 ; i < n ; i++){
        String s = sc.next();
        char[] arr = s.toCharArray();
        String len = String.valueOf(arr.length - 2);
        if(arr.length > 10){
                System.out.println(arr[0] + len + arr[arr.length - 1]); 
            }
        else{
                System.out.println(s);
        }
        System.out.println(result);

       
    }
}
}