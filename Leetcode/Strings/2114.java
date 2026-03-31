class Solution {
    public int mostWordsFound(String[] s) {
        int count = 0;
        int prev = 0;
        for(int i = 0 ; i < s.length ; i++){
            char[] str = s[i].toCharArray();
            for(int j = 0 ; j < str.length ; j++){
                if(str[j] == ' '){
                    count++;
                }
            }
            prev = Math.max(prev,count);
            count = 0;
        }
        return prev+1 ;
    }
}