package LL;

public class Delete_nthNode {
    Node head;
    public void createll(){
        this.head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next = new Node(5);
    }
    public void display(Node head){
        Node current = head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    public void remove(Node head,int n){
        Node current = head;
        Node previous=null;
        if(current.data==n){
            head=head.next;
        }
        while(current!=null){
            if(current.data==n){
                previous.next=current.next;
            }
            previous=current;
            current=current.next;
        }
    }
    public static void main(String[] args) {
        Delete_nthNode ll = new Delete_nthNode();
        ll.createll();
        ll.display(ll.head);
        ll.remove(ll.head,1);
    }
}
