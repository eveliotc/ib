/**
 * Definition for singly-linked list.
 * class ListNode {
 * public int val;
 * public ListNode next;
 * ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode a) {
        ListNode result = a.next == null ? a : a.next;
        ListNode p = new ListNode(Integer.MIN_VALUE);
        ListNode b = null, c = null;
        while (a != null && a.next != null) {
            b = a.next;
            c = b.next;
            b.next = a;
            p.next = b;
            a.next = c;
            p = a;
            a = c;
        }
        return result;

    }
}

