/**
 * Definition for binary tree
 * class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ArrayList<Integer> postorderTraversal(TreeNode a) {
        Deque<TreeNode> s = new ArrayDeque<>();
        LinkedList<Integer> r = new LinkedList<>();
        if (a != null) {
            s.addFirst(a);
        }
        while (!s.isEmpty()) {
            a = s.removeFirst();
            r.add(0, a.val);

            if (a.left != null) {
                s.addFirst(a.left);
            }
            if (a.right != null) {
                s.addFirst(a.right);
            }
        }
        return new ArrayList<>(r);
    }
}

// postOrder(node) {
//     if node == null return null;
//     postOrder(node.left);
//     postOrder(node.right);
//     print node.val;
// }

