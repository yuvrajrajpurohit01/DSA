import java.util.*;

public 

class A381 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        } 
        
        int s = 0;
        int d = 0;
        int idx1 = a.length-1;
        int idx2 = 0;
        boolean turnS = true;
        while (idx2<=idx1) {
            int p;

            if(a[idx2] >= a[idx1]){
                p = a[idx2];
                idx2++;
            }
            else{
                p = a[idx1];
                idx1--;
            }

            if(turnS){
                s+=p;
            }
            else{
                d+=p;
            }
            turnS = !turnS;

        }

        System.out.println(s);
        System.out.println(d);
        
    }
    
}