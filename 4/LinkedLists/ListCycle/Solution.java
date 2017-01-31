/**
 * Definition for singly-linked list.
 * class ListNode {
 * public int val;
 * public ListNode next;
 * ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode p = head;
        ListNode q = head;
        while (true) {
            if (p == null || p.next == null) return null;
            if (q == null || q.next == null || q.next.next == null) return null;
            p = p.next;
            q = q.next.next;
            if (p == q) {
                q = head;
                while (p != q) {
                    p = p.next;
                    q = q.next;
                }
                return p;
            }
        }
    }
}

