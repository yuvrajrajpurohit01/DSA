class Solution {
    public char repeatedCharacter(String s) {
       char res = ' ';

       for(int i = 1; i < s.length(); i++){
            for(int j = 0; j < i; j++){
                if((s.charAt(i) ^ s.charAt(j)) == 0){
                    return s.charAt(i);
                }
            }
        }
        return ' ';
    }
}