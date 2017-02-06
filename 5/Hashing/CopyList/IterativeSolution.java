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
        RandomListNode newhead = copyOf(head);
        RandomListNode n = head.next;
        while (n != null) {
            copyOf(n);
            n = n.next;
        }
        RandomListNode o = head;
        RandomListNode i = newhead;
        while (o != null) {
            i.next = nodes.get(o.next);
            i.random = nodes.get(o.random);
            i = i.next;
            o = o.next;

        }
        return newhead;
    }

    private RandomListNode copyOf(RandomListNode node) {
        if (node == null) {
            return null;
        }
        RandomListNode copy = nodes.get(node);
        if (copy == null) {
            copy = new RandomListNode(node.label);
            nodes.put(node, copy);
        }
        return copy;
    }
}
