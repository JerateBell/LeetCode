package LeetCode.Tree.PathSumII;

import java.util.ArrayList;
import java.util.List;

public class App {
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum (TreeNode root, int targetSum) {
        dfs(new ArrayList<Integer>(), root, targetSum);
        return res;
    }

    private void dfs (List<Integer> currList, TreeNode root, int targetSum) {
        if(root == null) return;

        currList.add(root.val);

        if (root.left == null && root.right == null && root.val == targetSum) res.add(new ArrayList<>(currList));

        dfs(currList, root.left, targetSum - root.val);
        dfs(currList, root.right, targetSum - root.val);

        currList.remove(currList.size()-1);
    }
}
