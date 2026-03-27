import java.util.*;
public class soldierbanana {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int n = sc.nextInt();
    int w = sc.nextInt();
    int result = 0;
    int cost = 0;
    for(int i = 1 ; i <= w ; i++){
        cost += i*k;
    }
    if((n-cost)<0){
        result = cost - n;
    }
    else{result = 0;}
    System.out.println(result);
}     
}
