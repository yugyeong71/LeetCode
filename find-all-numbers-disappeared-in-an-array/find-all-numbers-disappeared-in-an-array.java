class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] numsLengthList = new boolean[nums.length];
        
        List<Integer> result = new ArrayList<>();
        
        for (int num : nums) {
            numsLengthList[num - 1] = true;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (!numsLengthList[i]) {
                result.add(i+1);
            }         
        }
        
        return result;
    }
}