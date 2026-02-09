package BitManipulation;

import java.util.Scanner;

public class xoropinarr {
    class Solution {
    public int xorOperation(int n, int start) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[n];
        int res = 0;
        for (int i = 0 ; i < n ; i++){
            res ^= (start + 2*i);
        }  
    return res;
    }
}
}
