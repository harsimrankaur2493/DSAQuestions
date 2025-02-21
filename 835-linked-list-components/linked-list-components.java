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
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        ListNode temp = head;
        int count=0;
        boolean inComponent = false;

        while(temp!=null){
            if(set.contains(temp.val)){
                if(inComponent==false){//only counts when a new component starts
                    count++;
                    inComponent = true;
                }

                //skips counting if new component doesn't start 
            }else{
                inComponent = false;// closes component upon discontinuation of consecutivity
            }
            temp = temp.next;
        }

        return count;
    }
}