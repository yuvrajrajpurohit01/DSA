package BitManipulation;

public class powerof4 {
    class Solution {
    public boolean isPowerOfFour(int n) {
        if (n<0){
            return false;
        }
        else {
            if (n==0){
                return false;
            }
            else if ((n&(n-1))==0){
                int a = (int)(Math.log(n) / Math.log(2) + 1);
                if (a%2 != 0){
                    return true;
                }    
            }
        }
        return false;
    }
}
}
