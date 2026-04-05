class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int m = 0;
        for(int i = 0 ; i<nums.length/2 ; i++){
            int a = nums[i] + nums[nums.length-i-1];
            m = Math.max(m,a);
        }
        return m;
    }
}