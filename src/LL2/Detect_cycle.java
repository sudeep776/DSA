package LL2;

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
public class Detect_cycle {
    Node head;
    public void createLL(){
        this.head=new Node(1);
        Node two=new Node(2);
        head.next=two;
        Node three = new Node(3);
        two.next=three;
        Node four = new Node(4);
        three.next=four;
        Node five = new Node(5);
        four.next=five;
        five.next=three;
    }
    public void display(Node head){
        Node current = head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }

    public boolean detect_cycle(Node head){
        Node current = head;
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }return false;
    }

    public int findStartingPoint(Node head){
        Node current = head;
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        fast = head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }return slow.data;
    }

    public static void main(String[] args) {
        Detect_cycle ll = new Detect_cycle();
        ll.createLL();
//        ll.display(ll.head);
        Boolean result = ll.detect_cycle(ll.head);
        System.out.println(result);
        int startingPoint = ll.findStartingPoint(ll.head);
        System.out.println(startingPoint);
    }
}
