package LL;


public class LL_middle {
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

    public Node findMiddle(Node head){
        if(head==null) return null;
        Node fastPtr = head;
        Node slowPtr = head;
        while(fastPtr!=null && fastPtr.next!=null){
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
        }return slowPtr;
    }

    public static void main(String[] args) {
        LL_middle ll = new LL_middle();
        ll.createLL();
        ll.display(ll.head);
        Node result = ll.findMiddle(ll.head);
        System.out.println(result.data);
    }
}

