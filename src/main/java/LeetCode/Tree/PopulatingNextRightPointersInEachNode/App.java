package LeetCode.Tree.PopulatingNextRightPointersInEachNode;

public class App {
    public Node connect(Node root) {
        if (root == null) return root;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size ; i++) {
                Node curr = q.poll();
                if (i + 1 < size) {
                    curr.next = q.peek();
                }
                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
            }
        }

        return root;
    }
}
