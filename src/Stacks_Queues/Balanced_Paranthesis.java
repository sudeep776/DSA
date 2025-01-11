package Stacks_Queues;

import java.util.Stack;

//if its open brackets add it to stack
// if its close check if the top of the stack matches with the closing one
// else return false
public class Balanced_Paranthesis {
    public static boolean isValid(String test){
        Stack<Character> st = new Stack<>();
        for(char it:test.toCharArray()){
            if(it=='('|| it=='[' || it=='{'){
                st.push(it);
            }
            else {
                if(st.isEmpty()) return false;
                char ch = st.pop();
                if((it==')'&& ch=='(') || (it==']'&& ch=='[') || (it=='}' && ch=='{')) continue;
                else return false;
            }
        }return st.isEmpty();
    }
    public static void main(String[] args) {
        String test = "()[{}()]";
        if(isValid(test)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
