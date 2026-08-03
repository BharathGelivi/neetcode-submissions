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
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;

            slow = slow.next;
        }
        ListNode prev = null;
        ListNode current = slow.next;
        slow.next = null;
        ListNode next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        ListNode stemp = head;
        ListNode ltemp = prev;
        while (stemp != null && ltemp != null) {
            ListNode t1 = stemp.next;
            ListNode t2 = ltemp.next;
            stemp.next = ltemp;
            ltemp.next = t1;
            stemp = t1;
            ltemp = t2;
        }
        return;
    }
}
