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
    public ListNode reverseKGroup(ListNode head, int k) {
         if (head == null || k <= 1) {
            return head;
        }

        ListNode current = head;
        int length = 0;

        // Calculate length of the linked list
        while (current != null) {
            length++;
            current = current.next;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupEnd = dummy;

        while (length >= k) {
            ListNode prev = null;
            ListNode curr = prevGroupEnd.next;
            ListNode next = null;
            
            // Reverse k nodes
            for (int i = 0; i < k; i++) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            // Connect previous part with reversed group
            ListNode start = prevGroupEnd.next; // The old head becomes new tail
            prevGroupEnd.next = prev; // prev is now the new head of this k-group
            start.next = curr; // Connect to next segment

            // Move prevGroupEnd to the new end
            prevGroupEnd = start;
            length -= k;
        }

        return dummy.next;
    }
}