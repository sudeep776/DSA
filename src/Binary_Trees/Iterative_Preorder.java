package Binary_Trees;

import java.util.Stack;

public class Iterative_Preorder {
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
    public void preOrder(TreeNode root){
        Stack<TreeNode> s1 = new Stack<>();
        s1.push(root);
        while(!s1.isEmpty()){
            TreeNode temp = s1.pop();
            System.out.println(temp.data);
            if(temp.right!=null){
                s1.push(temp.right);
            }
            if(temp.left!=null){
                s1.push(temp.left);
            }
        }
    }

    public static void main(String[] args) {
        Iterative_Preorder bt = new Iterative_Preorder();
        bt.createBinaryTree();
        bt.preOrder(bt.root);
    }
}

