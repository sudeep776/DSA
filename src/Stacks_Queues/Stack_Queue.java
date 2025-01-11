package Stacks_Queues;

import java.util.LinkedList;
import java.util.Queue;

//Stack using Queue
class StackQueue{
        Queue<Integer> q = new LinkedList<>();
        void push(int x){
            //adds to end of queue
            q.add(x);
            for(int i=0;i<q.size()-1;i++){
                q.add(q.remove());
            }
        }
        int pop(){
            return q.remove();
        }
        int top(){
            return q.peek();
        }
        int size(){
            return q.size();
        }
}
public class Stack_Queue {
}
