class Solution {
    public String customSortString(String order, String s) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < order.length(); i++) {
            char ch = order.charAt(i);

            while (freq[ch - 'a'] > 0) {
                result.append(ch);
                freq[ch - 'a']--;
            }
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            while (freq[ch - 'a'] > 0) {
                result.append(ch);
                freq[ch - 'a']--;
            }
        }

        return result.toString();
    }
}