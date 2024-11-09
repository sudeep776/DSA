package LL;

public class Add_two_lists {
    Node head1;
    Node head2;
    public void createLL1(){
        Node seven = new Node(7);
        Node two = new Node(2);
        Node four = new Node(4);
        Node three = new Node(3);
        this.head1 = seven;
        seven.next = two;
        two.next = four;
        four.next = three;
    }

    // Method to create the second linked list: 5 -> 6 -> 4
    public void createLL2(){
        Node five = new Node(5);
        Node six = new Node(6);
        Node four = new Node(4);
        this.head2 = five;
        five.next = six;
        six.next = four;
    }
    public void display(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }

    public Node reverse(Node head){
        Node current = head;
        Node previous = null;
        Node next = null;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous = current;
            current=next;
        }return previous;
    }

    public static Node sum(Node list1,Node list2){
        int carry=0;
        Node dummy = new Node(0);
        Node temp = dummy;
        while(list1!=null || list2!=null || carry!=0){
            int sum=0;
            if(list1!=null){
                sum+=list1.data;
                list1=list1.next;
            }
            if(list2!=null){
                sum+=list2.data;
                list2=list2.next;
            }
            sum+=carry;
            carry = sum/10;
            temp.next=new Node(sum%10);
            temp=temp.next;
        }return dummy.next;
    }

    public static void main(String[] args) {
        Add_two_lists ll = new Add_two_lists();
        ll.createLL1();
        ll.createLL2();
        Node list1 = ll.reverse(ll.head1);
        Node list2 = ll.reverse(ll.head2);
        Node result = sum(list1,list2);
        Node result1 = ll.reverse(result);
        ll.display(result1);
    }
}
