package LL;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Reverse_LL {
    Node head;
    public void createLL(){
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        this.head=new Node(1);
        this.head.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
    }
    public void display(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public Node reverse(Node head){
        Node previous = null;
        Node next=null;
        Node current=head;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }
    public static void main(String[] args) {
        Reverse_LL ll = new Reverse_LL();
        ll.createLL();
        ll.display(ll.head);
        Node result = ll.reverse(ll.head);
        ll.display(result);
    }
}
