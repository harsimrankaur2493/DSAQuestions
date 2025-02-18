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
    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

       
        //slow shifted one point ahead if list is odd
        ListNode secondHalf = slow.next;
        slow.next=null;
        secondHalf = reverse(secondHalf);
        
        ListNode firstHalf = head;
        while(secondHalf !=null){
           ListNode temp1 = firstHalf.next;
           ListNode temp2 = secondHalf.next;

           firstHalf.next = secondHalf;
           secondHalf.next = temp1;

           firstHalf = temp1;
           secondHalf = temp2;


        }
        
    }
}