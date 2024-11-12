package LL2;

public class Pallindrome {
    Node head;

    public void createLL(){
        this.head=new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node threeD = new Node(3);
        Node four = new Node(2);
        Node five = new Node(1);
        this.head.next=two;
        two.next=three;
        three.next=four;
        four.next=threeD;
        threeD.next=four;
        four.next=five;
    }
    public Node reverseList(Node head){
        Node current =head;
        Node previous=null;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }return previous;
    }
    public Node getMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }return slow;
    }
    public static void main(String[] args) {
        Pallindrome ll = new Pallindrome();
        ll.createLL();
        Node mid = ll.getMiddle(ll.head);
        Node secondHead = ll.reverseList(mid);
        Node firstHead = ll.head;
        while(firstHead!=secondHead){
            if(firstHead.data==secondHead.data){
                firstHead=firstHead.next;
                secondHead=secondHead.next;
            }
            else{
                System.out.println("not a pallindrome");
                return;
            }
        }
        System.out.println("pallindrome");
    }
}
