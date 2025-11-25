class Solution {
    public int removeDuplicates(int[] nums) {
        int insert = 0;
        int current = 0;
        
        while (current < nums.length) {
            if (nums[current] != nums[insert]) {
                insert++;
                nums[insert] = nums[current];
            }
            
            current++;            
        }
        
        return insert + 1;
    }
}