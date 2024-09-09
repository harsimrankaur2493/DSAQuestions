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

 /**
 logic =>
 1prev, 1 curr
 if(val==head)=> update head
 if val encountered 
 curr=curr.next;
 prev.next=curr
 else 
 prev+;
 curr++;
 
  */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        ListNode prev=head;
        ListNode curr=head.next;

       while(curr!=null){
            // if(head.val==val){
            //     head=head.next;
            // }
         if(curr.val==val){
            prev.next=curr.next;
            curr=curr.next;
          } 
          else{
            prev=curr;
          curr=curr.next;
          }
        } 
        if(head.val==val){
            head=head.next;
        }
        return head ;
        
    }
}