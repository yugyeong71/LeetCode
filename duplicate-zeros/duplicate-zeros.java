class Solution {
    public void duplicateZeros(int[] arr) {
        int count = 0;
        
        for(int i : arr) {
            if (i == 0) {
                count++;
            }
        }
        
        for(int i = arr.length - 1; i >= 0; i--) {
            int j = i + count;
            
            if(arr[i] == 0) {
                if(j < arr.length) {
                    arr[j] = 0;
                }
                count--;
                j--;
            }
            
            if (j < arr.length) {
                arr[j] = arr[i];
            }
        }
    }
}