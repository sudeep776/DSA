package Stacks_Queues;

//LIFO - Last in First out
// push - increase top pointer and assign the value in the array with the help of top pointer
//pop - decrease the top pointer but before return the value
class Stack{
    int size=1000;
    int arr[] = new int[size];
    int top = -1;
    void push(int x){
        top++;
        arr[top]=x;
    }
    int pop(){
        int x = arr[top];
        top--;
        return x;
    }
    int top(){
        return arr[top];
    }
    int size(){
        return top+1;
    }
}

public class Stack_Arrays {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        int x = s.pop();
        //System.out.println(x);
        int y = s.top();
        System.out.println(y);
//        for(int a:s.arr){
//            System.out.println(a);
//        }
    }
}
