/**
 * Definition for singly-linked list.
 * * class ListNode {
 * *     public int val;
 * *     public ListNode next;
 * *     ListNode(int x) { val = x; next = null; }
 * * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode head = new ListNode(Integer.MIN_VALUE);
        ListNode current = head;
        do {
            ListNode add = a == null ? b : (b == null ? a : (a.val <= b.val ? a : b));
            if (add == a && a != null) {
                a = a.next;
            } else if (add == b && b != null) {
                b = b.next;
            }
            current.next = add;
            current = add;
        } while (current != null);
        return head.next;
    }
}

