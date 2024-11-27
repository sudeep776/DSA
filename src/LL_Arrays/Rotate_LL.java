package LL_Arrays;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
    public Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
}
public class Rotate_LL {
    Node head;
    private void createLL(){
        Node first = new Node(1);
        Node second = new Node(2);
        this.head=new Node(0,first);
        first.next=second;
    }
    private void display(Node head){
        Node current = head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    private Node rotate(Node head,int k){
        if(head==null||head.next==null)return head;
        for(int i=0;i<k;i++){
            Node temp = head;
            while(temp.next.next!=null) temp=temp.next;
            Node end=temp.next;
            end.next=head;
            head=end;
        }return head;
    }
    public static void main(String[] args) {
        Rotate_LL ll = new Rotate_LL();
        ll.createLL();
        ll.display(ll.head);
        ll.rotate(ll.head,2);
    }
}
