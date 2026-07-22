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
   public  void reorderList(ListNode head) {

    if (head == null || head.next == null) {
      return;
    }

    // 1. Find middle
    ListNode slow = head;
    ListNode fast = head;

    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    // 2. Separate the two halves
    ListNode second = slow.next;
    slow.next = null;

    // 3. Reverse second half
    second = reverseList(second);

    // 4. Merge alternately
    ListNode dummy = new ListNode();
    ListNode curr = dummy;

    while (head != null && second != null) {

      curr.next = head;
      curr = curr.next;
      head = head.next;

      curr.next = second;
      curr = curr.next;
      second = second.next;
    }

    // If first half has remaining node
    curr.next = head;

    // Print result
    ListNode result = dummy.next;

    while (result != null) {
      System.out.print(result.val + " ");
      result = result.next;
    }
  }

  public  ListNode reverseList(ListNode head) {

    ListNode currNode = head;
    ListNode prevNode = null;

    while (currNode != null) {
      ListNode temp = currNode.next;
      currNode.next = prevNode;
      prevNode = currNode;
      currNode = temp;
    }

    return prevNode;


  }

 
}
