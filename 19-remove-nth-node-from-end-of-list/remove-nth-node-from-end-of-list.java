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

        // if(head.next == null || head==null){
        //     return null;
        // }
        ListNode temp = new ListNode(0);
        temp.next=head;
        ListNode fast=temp;
        ListNode slow=temp;

        for(int i=0;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null ){
            slow=slow.next;
            fast=fast.next;
        }

        //slow points to the node to delete

        slow.next = slow.next.next;

        return temp.next;

    }
}