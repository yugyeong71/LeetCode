class Solution {
    public int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        
        if (needleLength == 0) {
            return 0;
        }
        
        for (int i = 0; i <= haystackLength - needleLength; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int count = 0;
                
                while (count < needleLength && haystack.charAt(i + count) == needle.charAt(count)) {
                    count++;
                }
                
                if (count == needleLength) {
                    return i;
                }
            }
        }
        
        return -1;
    }
}