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
    public boolean isPalindrome(ListNode head) {
        //find the middle element
        ListNode fast = head;
        ListNode slow = head;

        while(fast !=null && fast.next !=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        //if fast is not null => list length is odd so move slow pointer one step forward
        if(fast!=null){
            slow=slow.next;
        }
        

        //temp 1 and temp 2 define
        ListNode temp1 = head;
        ListNode temp2 = reverse(slow);

        //2nd half of the list is reversed
        //compare values starting from the first value to the middle
        
        while(temp2!=null){
            if(temp1.val != temp2.val){
                return false;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }

        return true;
    }

    private ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr = head;
        while(curr !=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }
}