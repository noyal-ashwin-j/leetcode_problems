class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] ls = new int[26];
        for (int i = 0; i < text.length(); i++) {
            ls[text.charAt(i) - 'a']++;
        }
        int b = ls['b' - 'a'];
        int a = ls['a' - 'a'];
        int l = ls['l' - 'a'] / 2;
        int o = ls['o' - 'a'] / 2;
        int n = ls['n' - 'a'];
        return Math.min(Math.min(b, a),Math.min(Math.min(l, o), n));
    }
}