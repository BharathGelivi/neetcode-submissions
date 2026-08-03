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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode list1head=list1;
        ListNode list2head=list2;
        ListNode mhead;
        if(list1head.val>=list2head.val){
            mhead=list2head;
            list2head=list2head.next;
        }else{
            mhead=list1head;
            list1head=list1head.next;
        }
        ListNode mheadpointer=mhead;
        while(list1head!=null&&list2head!=null){
            if(list1head.val<=list2head.val){
                mheadpointer.next=list1head;
                list1head=list1head.next;
            }
            else{
                mheadpointer.next=list2head;
                list2head=list2head.next;
            }
            mheadpointer=mheadpointer.next;
        }
        if(list1head!=null){
            mheadpointer.next=list1head;
            
        }
        if(list2head!=null){
            mheadpointer.next=list2head;
            
        }
        return mhead;
    }
}