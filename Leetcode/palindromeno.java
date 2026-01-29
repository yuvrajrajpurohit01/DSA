class Solution {
    public boolean isPalindrome(int x) {
        char[] y = String.valueOf(x).toCharArray();
        int l = 0;
        int r = y.length - 1; 
        while(l<r){
            if(y[l] != y[r]){
                return false;
            }
            l++;
            r--;
        }
        return true; 
    }
};

