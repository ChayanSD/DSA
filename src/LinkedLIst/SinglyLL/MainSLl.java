package LinkedLIst.SinglyLL;

public class MainSLl {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertFirst(7);
        list.insertFirst(6);
        list.insertFirst(5);
        list.insertLast(77);
        list.insertAtAny(11,3);
        System.out.println(list.deleteFirst());
        list.display();
    }
}
