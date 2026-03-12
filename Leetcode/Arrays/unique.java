class Solution {
    public int sumOfUnique(int[] nums) {

        int count = 0;

        for(int i = 0; i < nums.length; i++){
            int freq = 0;

            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    freq++;
                }
            }

            if(freq == 1){
                count += nums[i];
            }
        }

        return count;
    }
}

