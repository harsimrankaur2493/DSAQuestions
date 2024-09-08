public class Pallindrome{
   public Node findMid(Node head){
        Node slow=head;
        Node fast = head;
        while(fast!= null && fast.next!=null){
            
            fast=fast.next.next;
            slow=slow.next;
        }

        return slow;
    }

    public boolean isPallindromeNew(){
        /*
         * ll-> arraylist-> O(n)-tc and O(n) space complexity
         * or
         * ll-> string 
         * 
         * 
         * 
         * 2nd approach
         * -> fnd mid
         * ->2nd half reverse
         * -> check if 1st half == 2nd half
         * 
         * => 2 cases , od and even case
         * ---> slow fast technique 
         * -> slow=head -> +1
         * -> slow = head -> +2
         * 
         */
        //step1 -> find mid
        //step 2 -> reerse 2nd half
        //step 2-> check left half and right half

        //base case -> if head == null
        if(head == null || head.next ==null){
            return true;
        }
        Node midNode=findMid(head);

        Node prev=null;
        Node curr=midNode;
        Node Next;
        while(curr != null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        Node right=prev;
        Node left=head;

        while(right!=null){
            if(left.data !=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

}
