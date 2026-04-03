class Solution {
    public boolean isBalanced(String num) {
        int n1 = 0;
        int n2 = 0;
        for(int i = 0 ; i< num.length() ; i++){
            if(i%2 == 0){
                n1 += num.charAt(i) -'0';
            }
            else{
                n2 += num.charAt(i) -'0';
            }
        }
        if(n1 == n2){
            return true;
        }
        return false;
    }
}