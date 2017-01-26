/**
 * Definition for singly-linked list.
 * class ListNode {
 * public int val;
 * public ListNode next;
 * ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode a) {
        ListNode head = a;
        ListNode p = a;
        while (a != null) {
            ListNode n = a.next;
            if (n != null && n.val != p.val) {
                p.next = n;
                p = n;
            }
            a = a.next;
        }
        p.next = null;
        return head;
    }
}

