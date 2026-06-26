class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int max = nums[0];

        for (int i:nums) {
            // if (currSum > max) {
            //     max = currSum;
            // }
            if (currSum < 0) {
                currSum = 0;
            }
            currSum += i;
            max= Math.max(max, currSum);
        }
        return max;
    }
}
