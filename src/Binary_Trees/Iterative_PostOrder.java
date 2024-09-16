package Binary_Trees;

import java.util.Stack;

//using 2 stacks
public class Iterative_PostOrder {
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
        Stack<TreeNode> s2 = new Stack<>();
        TreeNode temp = root;
        s1.push(root);
        while (!s1.isEmpty()) {
            TreeNode node = s1.pop();
            s2.push(node);

            if (node.left != null) {
                s1.push(node.left);
            }
            if (node.right != null) {
                s1.push(node.right);
            }
        }

        while (!s2.isEmpty()) {
            System.out.println(s2.pop().data);
        }
    }
    public static void main(String[] args) {
        Iterative_PostOrder b1 = new Iterative_PostOrder();
        b1.createBinaryTree();
        b1.postOrder(b1.root);
    }
}
