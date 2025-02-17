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
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        boolean flag=false;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                flag=true;
                break;
            }

        }
        if(flag==false){
            return null;
        }
        flag=false;
        slow=head;
        while(fast.next!=null && slow.next!=null){
            if(fast==slow){
                flag=true;
                break;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}