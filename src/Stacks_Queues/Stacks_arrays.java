package Stacks_Queues;

class Stack{
    int size=1000;
    int arr[]=new int[size];
    int top =-1;
    void push(int value){
        top++;
        arr[top]=value;
    }
        int pop(){
        int x = arr[top];
        top--;
        return x;
    }
}

public class Stacks_arrays {
}
