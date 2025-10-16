package LeetCode.String.BinaryTreePaths;

public class App {
    private List<String> list = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root, "");
        return list;
    }

    private void dfs (TreeNode root, String s) {
        if(root == null) return;

        s +="->" + root.val;

        if (root.left == null && root.right == null) {
            s = s.substring(2);
            list.add(s);
        }

        dfs(root.left, s);
        s = s.substring(0, s.length());
        dfs(root.right, s);
    }
}
