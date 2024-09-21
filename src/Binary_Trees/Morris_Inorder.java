package Binary_Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Morris_Inorder {
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
    public void inOrder(TreeNode root){
        TreeNode current = root;
        while(current!=null){
            if(current.left==null){
                System.out.println(current.data);
                current=current.right;
            }
            else{
                TreeNode predecessor = current.left;
                while(predecessor.right!=null && predecessor.right!=current){
                    predecessor = predecessor.right;
                }
                if(predecessor.right==null){
                    predecessor.right=current;
                    current=current.left;
                }
                else{
                    predecessor.right=null;
                    System.out.println(current.data);
                    current=current.right;
                }
            }
        }
    }
    public static void main(String[] args) {
        Morris_Inorder b1 = new Morris_Inorder();
        b1.createBinaryTree();
        b1.inOrder(b1.root);
    }
}
