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
        Stack <Integer> St= new Stack<>();
        ListNode temp=head;
        while(temp != null){
            St.push(temp.val);
            temp=temp.next;
        }
        ListNode temp1=head;
        while(temp1!=null){
            if(St.pop() != temp1.val){
                return false;
            }
            temp1=temp1.next;
        }
        return true;
    }
}