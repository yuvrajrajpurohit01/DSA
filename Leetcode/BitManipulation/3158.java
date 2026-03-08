class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int[] numbers = new int[50];
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            for(int j = 0; j<i ; j++){
                if(nums[i]==nums[j]){
                    numbers[i] += nums[i];
                    break;
                }
            }
        }
        for (int i = 0 ; i < numbers.length ; i++){
            n ^= numbers[i];
        }
        return n;
    }
}