class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int count = 0;

        int result = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            count += nums[right];

            while (count >= target) {
                result = Math.min(result, right - left + 1);
                count -= nums[left];
                left++;
            }
        }
        
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}