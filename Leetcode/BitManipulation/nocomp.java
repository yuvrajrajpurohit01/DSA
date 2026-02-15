class Solution {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        StringBuilder res = new StringBuilder("");
        for (int i = 0 ; i<binary.length();i++){
            if(binary.charAt(i)!= '0'){
                res.append('0');
            }
            else{
                res.append('1');
            }
        }
        String as = res.toString();
        int ans = Integer.parseInt(as,2);
        return ans;
    }
}