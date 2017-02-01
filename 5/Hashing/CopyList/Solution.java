/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 * int label;
 * RandomListNode next, random;
 * RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    HashMap<RandomListNode, RandomListNode> nodes;

    public RandomListNode copyRandomList(RandomListNode head) {
        nodes = new HashMap<>();
        return copyOf(head);
    }

    private RandomListNode copyOf(RandomListNode node) {
        if (node == null) {
            return null;
        }
        RandomListNode copy = nodes.get(node);
        if (copy == null) {
            copy = new RandomListNode(node.label);
            nodes.put(node, copy);
            copy.next = copyOf(node.next);
            copy.random = copyOf(node.random);
        }
        return copy;
    }
}

