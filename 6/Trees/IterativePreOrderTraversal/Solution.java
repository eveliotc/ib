/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	public ArrayList<Integer> preorderTraversal(TreeNode a) {
	    Deque<TreeNode> s = new ArrayDeque<>();
	    ArrayList<Integer> r = new ArrayList<>();
	    if (a != null) {
	        s.addFirst(a);
	    }
	    while (!s.isEmpty()) {
	        a = s.removeFirst();
	        r.add(a.val);
	        if (a.right != null) {
	            s.addFirst(a.right);
	        }
	        if (a.left != null) {
	            s.addFirst(a.left);
	        }
	    }
	    return r;
	}
}

// preOrder(node) {
//     if node == null return
//     print node.val
//     preOrder(node.left)
//     preOrder(node.right)
// }
