package LL;


public class Merge_LL {
    Node head;
    public void createLL(){
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);

        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);

        display(list1);
        display(list2);
        Node newList =mergeLL(list1,list2);
        display(newList);
    }

    private Node mergeLL(Node list1, Node list2) {
        Node newList = new Node(-1);
        Node temp = newList;
        while(list1!=null && list2!=null){
            //now check if list1 < = list2 then add it to newList
            if(list1.data<=list2.data){
                temp.next=list1;
                list1=list1.next;
            }
            else{
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        //if list1 is not empty
        if(list1!=null){
            temp.next=list1;
        }
        else{
            temp.next=list2;
        }
        return newList.next;
    }

    public void display(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }


    public static void main(String[] args) {
        Merge_LL ll = new Merge_LL();
        ll.createLL();
    }
}

