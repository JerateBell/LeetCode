package LeetCode.Tree.BinaryTreeLevelOrderTraversal;

import java.util.List;

public class App {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null) return res;

        q.offer(root);

        while (q.size() > 0) {
            List<Integer> list = new ArrayList<>();
            int n = q.size();
            for (int i = 0; i < n; i++) {
                TreeNode front = q.poll();
                list.add(front.val);

                if(front.left != null) q.offer(front.left);

                if(front.right != null) q.offer(front.right);
            }
            res.add(list);
        }

        return res;
    }
}
