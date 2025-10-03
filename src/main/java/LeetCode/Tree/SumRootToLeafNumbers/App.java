package LeetCode.Tree.SumRootToLeafNumbers;

public class App {
    List<String> list = new ArrayList<>();

    public int sumNumbers (TreeNode root) {
        dfs(root, "");
        int count = 0;

        for (String s : list) {
            count += Integer.parseInt(s);
        }

        return count;
    }

    private void dfs (TreeNode root, String s) {
        if(root == null) return;

        s += String.valueOf(root.val);

        if(root.left == null && root.right == null) list.add(s);

        dfs(root.left, s);
        dfs(root.right, s);

        s.substring(0, s.length()-1);
    }
}
