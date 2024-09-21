package Binary_Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//using 2 stacks
public class Iterative_PostOrder_OP {
    private TreeNode root;
    public class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int data){
            this.data=data;
        }
    }
    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);

        root=first;
        first.left=second;
        first.right=third;

        second.left=fourth;
        second.right=fifth;

        third.left=sixth;
        third.right=seventh;
    }
    public void postOrder(TreeNode root){
        Stack<TreeNode> s1 = new Stack<>();
        List<Integer> result = new ArrayList<>();
        TreeNode current = root;
        TreeNode lastvisited=null;
        while(!s1.isEmpty() || current!=null){
            while(current!=null){
                s1.push(current);
                current=current.left;
            }
                TreeNode peekNode = s1.peek();
                if(peekNode.right!=null && peekNode.right!=lastvisited){
                    current=peekNode.right;
            }
                else{
                    result.add(peekNode.data);
                    lastvisited=s1.pop();
                }
        }
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }
    }
    public static void main(String[] args) {
        Iterative_PostOrder_OP b1 = new Iterative_PostOrder_OP();
        b1.createBinaryTree();
        b1.postOrder(b1.root);
    }
}
