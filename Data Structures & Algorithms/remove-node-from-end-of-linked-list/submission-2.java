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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int counter=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            counter++;
        }
        if(counter==n){
            return head.next;
        }
        ListNode temp1=head;
        for(int i=0;i<counter-n-1;i++){
            temp1=temp1.next;
        }
        if(temp1.next.next!=null){
            temp1.next=temp1.next.next;
        }
        else{
            temp1.next=null;
        }
        
    return head;
    }

}
