public class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        
        int low = 0;
        int high = height.length - 1;
        int total = 0;
        int first = 0;
        int second = 0;

        while (low < high) {
            first = Math.max(first, height[low]);
            second = Math.max(second, height[high]);
            if (first < second) {
                total += first - height[low];
                low++;
            } else {
                total += second - height[high];
                high--;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Solution solver = new Solution();
        
        // Test case: should trap 6 units of water
        int[] elevationMap = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        
        int result = solver.trap(elevationMap);
        System.out.println("Total trapped water: " + result);
    }
}