package LL;

public class Remove_Nnode_end {
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

    public Node removeNthNode(Node head,int n){
        Node dummy = new Node(0);
        dummy.next=head;
        Node fast = dummy;
        Node slow = dummy;
        for(int i=1;i<=n+1;i++){
            fast=fast.next;
        }
        //move both pointers one by one
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        Remove_Nnode_end ll = new Remove_Nnode_end();
        ll.createLL();
        ll.display(ll.head);
        ll.removeNthNode(ll.head,2);
        ll.display(ll.head);
    }
}
