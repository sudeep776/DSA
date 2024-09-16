package Binary_Trees;

//left subtree first --- root node --- right subtree
public class Recursive_inorder {
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
        if(root==null) return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public static void main(String[] args) {
        Recursive_inorder b1 = new Recursive_inorder();
        b1.createBinaryTree();
        b1.inOrder(b1.root);
    }
}
