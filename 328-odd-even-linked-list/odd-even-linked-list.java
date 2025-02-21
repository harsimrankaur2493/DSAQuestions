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
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode evenHead = head.next;
        ListNode odd=head;
        ListNode even = head.next;
        while(even !=null && even.next!=null){
            ListNode oddNext = odd.next.next;
            ListNode evenNext = even.next.next;
            odd.next = oddNext;
            
            even.next = evenNext;
            odd=oddNext;
            even = evenNext;
        }
        ListNode oddTail = odd;
        oddTail.next = evenHead;

        return head;
        
    }
}