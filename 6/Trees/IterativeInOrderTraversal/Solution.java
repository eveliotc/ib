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
    public ArrayList<Integer> inorderTraversal(TreeNode a) {
        Deque<TreeNode> s = new ArrayDeque<>();
        ArrayList<Integer> r = new ArrayList<>();
        while (!s.isEmpty() || a != null) {
            if (a != null) {
                s.addFirst(a);
                a = a.left;
                continue;
            }
            a = s.removeFirst();
            r.add(a.val);
            a = a.right;
        }
        return r;
    }

//     inOrder(TreeNode a) {
//         if (a == null) {
//             return;
//         }
//         inOrder(a.left);
//         print(a.val);
//         inOrder(a.right);
//     }
}

