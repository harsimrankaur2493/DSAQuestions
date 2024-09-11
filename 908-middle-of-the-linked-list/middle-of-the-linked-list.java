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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        ListNode tail = head;
        while(tail.next != null){
            tail=tail.next;
        }

        while(fast!=null && fast != tail){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }
}