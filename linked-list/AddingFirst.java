public class LinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next=null;
        }

    }

    // add method 
    /**
     * create new node
     * make that node point to the head
     * make it the new head
     * if previously ll is empty, tail needs to be made as head => also base case
    
     */

    public static Node head;
    public static Node tail;

    public void addFirst(int data ){
        Node newNode = new Node(data);//node created
        if(head==null){
            head = newNode;
            tail = newNode;
            return;
        }
        
        newNode.next = head;    // new node added to the linked list
        head = newNode; //head updated
        

    }

    public static void main(String []args){
        LinkedList ll= new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);

        System.out.println(ll);

    }
}
