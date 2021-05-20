// Program to recursive traverse the linked list
class Node{
    int x;
    Node next;
    Node(int data){
        x=data;
        next=null;
    }
}
public class RecursiveTraversal {
    static void display(Node head){
        if(head==null) return;
        System.out.print(head.x+" ");
        display(head.next);
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.next=temp2;
        display(head);
    }
}