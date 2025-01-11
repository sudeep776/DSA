package Stacks_Queues;

//Queue using Stack

import java.util.Stack;

class MyQueue{
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();
    public MyQueue(){

    }
    public void push(int x){
        System.out.println("The element is pushed");
        input.push(x);
    }
    public int pop(){
        //transfer from input to output
        if(output.isEmpty()){
            while(input.isEmpty()==false){
                output.push(input.peek());
                input.pop();
            }
        }
        int x = output.peek();
        output.pop();
        return x;
    }
    public int peek(){
        //shift input to output
        if(output.empty()){
            while(input.empty()==false){
                output.push(input.peek());
                input.pop();
            }
        }return output.peek();
    }
    public int size(){
        return output.size()+input.size();
    }
}

public class Queue_Stack {

}
