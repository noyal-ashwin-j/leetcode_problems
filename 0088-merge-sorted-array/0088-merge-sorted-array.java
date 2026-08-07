class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> temp = new ArrayList<>();        
        for (int i = 0; i < m; i++) {
            temp.add(nums1[i]); 
        }        
        for (int j = 0; j < n; j++) {
            temp.add(nums2[j]); 
        }       
        Collections.sort(temp);
        for (int i = 0; i < temp.size(); i++) {
            nums1[i] = temp.get(i);
        }
    }
}
