class Solution {
    public int bitwiseComplement(int n) {
        String binary = Integer.toBinaryString(n);
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