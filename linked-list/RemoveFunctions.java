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
    public static int size;

    public void addFirst(int data ){
        Node newNode = new Node(data);//node created
        size++;
        if(head==null){
            head = newNode;
            tail = newNode;
            return;
        }
        
        newNode.next = head;    // new node added to the linked list
        head = newNode; //head updated
        

    }

    public void addLast(int data){
        Node newNode = new Node(data);  //creating a newNode
        size++;
        if(head==null){
            head = newNode; //handling the case with an empty linked list
            tail = newNode;
            return;
        }

        tail.next = newNode;//adding to the linked list
        tail = newNode;//updating tail
    }
    public void printingList(){
        if(head==null){
            System.out.print("linked list is empty");
            return;
        }
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data +"->");
            temp=temp.next;

        }
        System.out.print("null");
    }

    //adding in the middle 
    public void addonIndex(int index, int data){
        
        if(index==0){
            addFirst(data);
            return;
        }
        size++;
        Node temp=head;
        int count=0;
        Node newNode= new Node(data);
        while(count+1 !=index){
            temp=temp.next;
                       
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        

    }
    public int removeFirst(){
        if(size ==0){
            System.out.println("linked list is empty");
            return Integer.MAX_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
            
        }
        
                
        int val = head.data;
        head = head.next;
        size--;
        return val;
        
    }

    public int removeLast(){
        if(size ==0){
            System.out.println("the linked list is already empty");
        }
        else if(size ==1){
            int val = head.data;
            removeFirst();
            size=0;
            return val;
        }

        int val = tail.data;
        Node temp = this.head;
        while(temp.next != tail){
            temp=temp.next;
        }
        temp.next=null;
        this.tail = temp;
        size--;
        return val;
    }

    public static void main(String []args){
        LinkedList ll= new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);

        ll.addLast(3);
        ll.addonIndex(2, 10);

        ll.printingList();
        System.out.println();
        System.out.println("size is: "+ll.size);

        ll.removeLast();
        ll.printingList();
        System.out.println("\n"+size);

    }
}
