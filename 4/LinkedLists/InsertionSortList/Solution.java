tion for singly-linked list.
        *

class ListNode {
 *
    public int val;
 *
    public ListNode next;
 *

    ListNode(int x) {
        val = x;
        next = null;
    }
 *
}
 */

public class Solution {
    public ListNode insertionSortList(ListNode c) {
        ListNode head = new ListNode(Integer.MIN_VALUE);
        while (c != null) {
            ListNode y = head;
            ListNode p = head;
            ListNode n = new ListNode(c.val);
            while (y != null) {
                if (y.val >= n.val) {
                    p.next = n;
                    n.next = y;
                    break;
                }
                p = y;
                y = y.next;
                if (y == null) {
                    p.next = n;
                }
            }
            c = c.next;
        }
        return head.next;
    }
}

