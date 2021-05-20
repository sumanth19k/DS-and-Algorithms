// Simple implementation of linked list, without using collections
class Node{
    int x;
    Node next;
    Node(int data){
        x=data;
        next=null;
    }
}
public class LinkedList {
    static void display(Node head){
        while(head!=null){
            System.out.print(head.x+" ");
            head=head.next;
        }
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
