class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {

        int total = 0;

        for (int i = 0; i < worker.length; i++) {

            int maxProfit = 0;

            for (int j = 0; j < difficulty.length; j++) {

                if (worker[i] >= difficulty[j]) {
                    maxProfit = Math.max(maxProfit, profit[j]);
                }
            }

            total = total + maxProfit;
        }

        return total;
    }
}