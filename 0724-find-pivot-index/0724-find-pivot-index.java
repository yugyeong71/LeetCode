class Solution {
    public int pivotIndex(int[] nums) {
        int[] sumLeft = new int[1000000];
        int[] sumRight = new int[1000000];
        
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                for (int j = 1; j < nums.length; j++) {
                    sumRight[i] += nums[j];
                }
                
                if (sumRight[i] == 0) {
                    return 0;
                }
            }
            
            for (int j = i - 1; j >= 0; j--) {
                sumLeft[i] += nums[j];
            }
            
            for (int j = i + 1; j < nums.length; j++) {
                sumRight[i] += nums[j];
            }
            
            if (sumLeft[i] == sumRight[i]){
                return i;
            }
        }
        
        return -1;
    }
}