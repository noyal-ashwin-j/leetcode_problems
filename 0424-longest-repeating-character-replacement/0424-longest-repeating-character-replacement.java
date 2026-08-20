class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxf = 0;
        int left = 0;
        int maxLen = 0;
        
        for (int right = 0; right < s.length(); right++) {
            maxf = Math.max(maxf, ++count[s.charAt(right) - 'A']);
            
            if ((right - left + 1) - maxf > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
}