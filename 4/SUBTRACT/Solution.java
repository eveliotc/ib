/**
 * Definition for singly-linked list.
 * class ListNode {
 * public int val;
 * public ListNode next;
 * ListNode(int x) { val = x; next = null; }
 * }
 */

import java.util.*;

public class Solution {

  public ListNode subtract(final ListNode a) {
    List<ListNode> list = asList(a);
    final int size = list.size();
    final int lastIndex = size - 1;
    final int toModify = (int) (size / 2);
    for (int i = 0; i < toModify; i++) {
      ListNode cur = list.get(i);
      cur.val = list.get(lastIndex - i).val - cur.val;
    }
    return a;
  }

  public List<ListNode> asList(final ListNode head) {
    List<ListNode> list = new ArrayList();
    ListNode node = head;
    while (node != null) {
      list.add(node);
      node = node.next;
    }
    return list;
  }

  public ListNode subtractFirstAttempt(final ListNode a) {
    final int size = size(a);
    final int toModify = (int) (size / 2);
    ListNode cur = a;
    for (int i = 0; i < toModify && cur != null; i++) {
      cur.val = reverseAt(a, size, i).val - cur.val;
      cur = cur.next;
    }
    return a;
  }

  public ListNode reverseAt(final ListNode head, int size, int fromLast) {
    final int lastIndex = size - 1;
    final int target = lastIndex - fromLast;
    int index = 0;
    ListNode node = head;
    while (index < target) {
      index++;
      node = node.next;
    }
    return node;
  }

  public int size(ListNode a) {
    int size = 0;
    while (a != null) {
      size++;
      a = a.next;
    }
    return size;
  }
}
