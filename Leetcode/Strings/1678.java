class Solution {
    public String interpret(String command) {
        String result = "";
        char[] arr = command.toCharArray();
        for(int i = 0 ; i< command.length() ; i++){
            if(arr[i] == 'G'){
                result += "G";
            }
            else if(arr[i] == '('){
                if(arr[i+1] == ')'){
                    result += "o";
                }
                else{
                    result += "al";
                }
            }
        }
        return result;
    }
}