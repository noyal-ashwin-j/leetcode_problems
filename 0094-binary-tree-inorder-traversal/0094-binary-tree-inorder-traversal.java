import java.util.*;

class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {

            // LEFT side
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // ROOT
            current = stack.pop();
            ans.add(current.val);

            // RIGHT
            current = current.right;
        }

        return ans;
    }
}