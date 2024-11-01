package Binary_Trees;


import java.util.ArrayList;
import java.util.List;

public class Root_NthNode {
    private TreeNode root;
    public class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public void createBinaryTree(){
        this.root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left=new TreeNode(6);
        root.left.right.right=new TreeNode(7);
    }
    public static void main(String[] args) {
        Root_NthNode r1 = new Root_NthNode();
        r1.createBinaryTree();
        List<Integer> result = new ArrayList<>();
        r1.getRoute(r1.root,result,7);
        for(Integer a1:result){
            System.out.println(a1);
        }
    }

    private boolean getRoute(TreeNode root, List<Integer> res,int x) {
        if(root==null) return false;
        res.add(root.data);
        if(root.data==x){
            return true;
        }
        if(getRoute(root.left,res,x)){
            return true;
        }
        if(getRoute(root.right,res,x)){
            return true;
        }
        res.remove(res.size()-1);
        return false;
    }
}
