class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        
        int count = 0;
        
        StringBuilder sb = new StringBuilder();
        
        while (i >= 0 || j >= 0 || count != 0) {
            int x = (i >= 0) ? a.charAt(i) - '0' : 0;
            int y = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sum = x + y + count;
            
            sb.append(sum % 2);
            
            count = sum / 2;

            i--;
            j--;
        }
        
        return sb.reverse().toString();
    }
}