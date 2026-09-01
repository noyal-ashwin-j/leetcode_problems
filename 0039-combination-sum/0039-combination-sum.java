class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        find(candidates, target, 0, new ArrayList<>(), answer);
        return answer;
    }
    static void find(int[] arr, int target, int index,
                     List<Integer> list,
                     List<List<Integer>> answer) {
        if (target == 0) {
            answer.add(new ArrayList<>(list));
            return;
        }
        if (target < 0 || index == arr.length) {
            return;
        }
        list.add(arr[index]);
        find(arr, target - arr[index], index, list, answer);
        list.remove(list.size() - 1);
        find(arr, target, index + 1, list, answer);
    }
}