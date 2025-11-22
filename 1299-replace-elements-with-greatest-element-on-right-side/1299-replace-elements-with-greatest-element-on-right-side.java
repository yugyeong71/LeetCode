class Solution {
    public int[] replaceElements(int[] arr) {
        int maxValue = -1;
        
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = maxValue;

            if (temp > maxValue) {
                maxValue = temp;
            }

        }
        
        return arr;
    }
}