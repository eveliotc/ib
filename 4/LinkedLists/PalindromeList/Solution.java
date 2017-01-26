/**
 * * Definition for singly-linked list.
 * * class ListNode {
 * *     public int val;
 * *     public ListNode next;
 * *     ListNode(int x) { val = x; next = null; }
 * * }
 */
public class Solution {

    public int lPalin(ListNode A) {
        if (A == null || A.next == null) {
            return 1;
        }

        ListNode it = A;
        ListNode p = null;
        ListNode op = null;
        while (it != null) {
            op = p;
            p = copyVal(it);
            p.next = op;

            it = it.next;
        }

        ListNode a = A;
        ListNode b = p;
        while (a != null) {
            if (a.val != b.val) {
                return 0;
            }
            b = b.next;
            a = a.next;
        }

        return 1;
    }

    private ListNode copyVal(ListNode node) {
        return new ListNode(node.val);
    }
}

