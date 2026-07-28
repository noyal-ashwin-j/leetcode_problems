class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] res = new int[n];
        left[0] = 1;
        right[n-1] = 1;
        for(int k = 1; k<n; k++){
            left[k] = left[k-1] * nums[k-1];
        }
        for(int m = n-2; m>=0; m--){
            right[m] = right[m+1] * nums[m+1];
        }
        for(int i = 0; i<n; i++){
            res[i] = left[i] * right[i];
        }
        return res;
    }
}