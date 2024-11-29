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
    private Node rotatebf(Node head,int k){
        if(head==null||head.next==null)return head;
        for(int i=0;i<k;i++){
            Node temp = head;
            while(temp.next.next!=null) temp=temp.next;
            Node end=temp.next;
            end.next=head;
            head=end;
        }return head;
    }

    private Node rotateOP(Node head,int k){
        if(head==null || head.next==null) return head;
        //get the length of the list
        Node temp = head;
        int length=1;
        while(temp.next!=null){
            length++;
            temp=temp.next;
        }

        //link the last node to the head
        temp.next=head;

        //calculate the k
        k=k%length;
        int end = length-k;
        while(end--!=0)temp=temp.next;
        head=temp.next;
        temp.next=null;
        return head;
    }

    public static void main(String[] args) {
        Rotate_LL ll = new Rotate_LL();
        ll.createLL();
        ll.display(ll.head);
       Node result= ll.rotateOP(ll.head,2);
       ll.display(result);
    }
}
