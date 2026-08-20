class Solution {
    public long minimumSteps(String s) {
        long sol = 0;
        long blackBallCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                blackBallCount++;
            } else {
                sol += blackBallCount;
            }
        }
        return sol;
    }
}