package LinkedLIst.Questions;

import java.util.List;

class ListNode{
    int val;
    ListNode next;

    public ListNode() {
    }
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }

}
public class ReverseLL {
    public static void main(String[] args) {
        ListNode node = new ListNode();
        node.val = 1;
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node = reverseList(node);
        while(node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }

     static ListNode reverseList(ListNode node) {
        if (node == null || node.next == null) return node;
        ListNode prev = null;
        ListNode curr = node;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }
        return prev;
    }
}
