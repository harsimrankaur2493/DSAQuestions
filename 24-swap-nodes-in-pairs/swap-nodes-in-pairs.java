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

    public void swap(ListNode head,ListNode N1, ListNode N2){
        ListNode temp=head;
        while(temp.next!=N1){
            temp=temp.next;
        }
        N1.next = N2.next;
        N2.next = N1;
        temp.next=N2;

    }
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode N1  = head;
        ListNode N2 = head.next;
        head.next = N2.next;
        N2.next = N1;
        head = N2;

        
        while(N1.next!=null&& N1.next.next !=null){
            N1=N1.next;
            N2=N1.next;
            swap(head, N1,N2);
        }
        return head;


    }
}