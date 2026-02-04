package BitManipulation;

public class reversebits {
    class Solution {
    public int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            // Step 1: Shift result to left to make space
            result <<= 1;

            // Step 2: Add the last bit of n into result
            result |= (n & 1);

            // Step 3: Shift n right to process next bit
            n >>= 1;
        }

        return result;
    }
}
}
