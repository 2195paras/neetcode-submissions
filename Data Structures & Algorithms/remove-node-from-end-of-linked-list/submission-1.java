/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
  public static ListNode removeNthFromEnd(ListNode head, int n) {

    if (head.next == null) {
      return null;
    }

    ListNode t = head;
    ListNode j = head;

    for (int i = 0; i < n; i++) {
      j = j.next;
    }
    t = head;
    // If fast is null, we need to remove head
    if (j == null) {
      return head.next;
    }

    // Move until fast reaches the last node
    while (j.next != null) {
      j = j.next;
      t = t.next;
    }

    // Remove node
    t.next = t.next.next;



    return head;

  }
}
