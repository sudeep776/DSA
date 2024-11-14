package LL2;

public class LL_Intersection {
    Node head;
    public static Node insertNode(Node head,int data){
     Node newNode = new Node(data);
        if(head==null){
         head=newNode;
     }
        else{
            Node current = head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }return head;
    }

    public Node intersection(Node head1,Node head2){
        Node d1 = head1;
        Node d2 = head2;
        while(d1!=d2){
            d1 = d1==null?head2:d1.next;
            d2 = d2==null?head1:d2.next;
        }
        return d1;
    }
    public static void main(String[] args) {
        Node head = null;
        head=insertNode(head,1);
        head=insertNode(head,3);
        head=insertNode(head,1);
        head=insertNode(head,2);
        head=insertNode(head,4);
        Node head1 = head;
        //move so that you can connect to the intersection point
        head = head.next.next.next;
        Node headSec = null;
        headSec=insertNode(headSec,3);
        Node head2 = headSec;
        //connect
        headSec.next = head;
        LL_Intersection ll = new LL_Intersection();
        Node result = ll.intersection(head,head2);
        System.out.println(result.data);
    }
}
