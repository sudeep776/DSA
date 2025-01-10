package Stacks_Queues;

class Queue{
    private int arr[];
    private int start,end,currSize,maxSize;
    public Queue(){
        arr = new int[16];
        int start=-1;
        int end =-1;
        currSize=0;
    }
    public Queue(int maxSize){
        this.maxSize=maxSize;
        arr=new int[maxSize];
        start=-1;
        end=-1;
        currSize=0;
    }
    public void push(int newElement){
        if(currSize==maxSize){
            System.out.println("Queue full");
            System.exit(1);
        }
        if(end==-1){
            start=0;
            end=0;
        }
        else{
            end=(end+1)%maxSize;
        }
        arr[end]=newElement;
        currSize++;
    }
    public int pop(){
        if(currSize==0){
            System.out.println("Queue is empty");
            System.exit(1);
        }
        int popped=arr[start];
        if(currSize==1){
            start=-1;
            end=-1;
        }
        else{
            start=(start+1)%maxSize;
        }
        currSize--;
        return popped;
    }

}

public class Queues_Arrays {
}
