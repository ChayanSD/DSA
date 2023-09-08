package LinkedLIst.SinglyLL;

public class SLL {
    private Node head;
    private Node tail;
    private int size;//Just maintain the size;

    public SLL() {
        this.size=0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int data) {
            this.value = data;
        }

        public Node(int data, Node next) {
            this.value = data;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        //Create a node
        Node node = new Node(val);
        node.next= head;
       //head is always pointing to the first node
        head = node;

        if(tail==null){
            tail=head;
        }
    size++;
    }
    public void insertLast(int val){
        if(head==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next= node;
        tail=node;
        size++;
    }
    public void insertAtAny(int val,int index){
        if(index==0){
            insertFirst(val);
        }
        if(index==size){
            insertLast(val);
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp= temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next= node;
        size++;
    }

    public int deleteFirst(){
        int val = head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value +"->");
            temp = temp.next;
        }
        System.out.print("End");
    }
}
