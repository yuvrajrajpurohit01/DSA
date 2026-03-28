class Solution {
    public int finalValueAfterOperations(String[] op) {
        int x = 0;
        for(int i = 0 ; i < op.length ; i++){
            if(op[i].contains("--X") ){
                --x;
                }
            else if (op[i].contains("X--")){
                x--;
            }
            else if (op[i].contains("++X")){
                ++x;
            }
            else if (op[i].contains("X++")){
                x++;
            }
        }
        return x;
    }
}