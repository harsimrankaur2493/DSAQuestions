/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //fast and slow pointer
        if(head==null){
            return false;
        }
        ListNode fast=head;
        ListNode slow=head;
        boolean flag=false;
        while(fast!=null && fast.next!=null ){
            fast=fast.next.next;//takes 2 steps at a time
            slow=slow.next;//takes 1 step at a time
            if(fast==slow){
                flag=true;
                break;
            }
            
        }
        return flag;

    }
}