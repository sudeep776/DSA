package Practice;

import java.util.*;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data){
       this.data=data;
        this.left= null;
       this.right=null;
    }
}
class Pair<K,V>{
    private K key;
    private V val;
    public Pair(K key,V val){
        this.key=key;
        this.val=val;
    }
    public K getKey(){
        return key;
    }
    public V getValue(){
        return val;
    }
}
public class Left_view {
    private TreeNode root;

    public void createBinaryTree(){
        this.root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(10);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(11);
        root.left.left.right = new TreeNode(5);
        root.left.left.right.right = new TreeNode(6);
    }
    public List<Integer> left_view(TreeNode root){
        List<Integer> res = new ArrayList<>();
        recursionLeft(root,0,res);
        return res;
    }


    private void recursionLeft(TreeNode root,int level,List<Integer> res) {
        if(root==null) return;
        if(level==res.size()) {
            res.add(root.data);
        }
        recursionLeft(root.left,level+1,res);
        recursionLeft(root.right,level+1,res);
    }

    public void topView(TreeNode root){
        //Queue - to traverse the tree - node and vertical
        //Map - to keep vertical and nodes
        Queue<Pair<Integer,TreeNode>> todo = new LinkedList<>();
        Map<Integer,Integer> nodes = new TreeMap<>(); // vertical to node mapping
        todo.add(new Pair<>(0,root));
        while(!todo.isEmpty()){
            Pair<Integer,TreeNode> p = todo.poll();
            int vertical = p.getKey();
            TreeNode temp = p.getValue();

            //search it in the map if exists
            if(!nodes.containsKey(vertical)){
                nodes.put(vertical,temp.data);
            }
            if(temp.left!=null){
                todo.add(new Pair<>(vertical-1,temp.left));
            }
            if(temp.right!=null){
                todo.add(new Pair<>(vertical+1,temp.right));
            }
        }
        System.out.println(nodes.values());
    }

    public static void main(String[] args) {
        Left_view l1 = new Left_view();
        l1.createBinaryTree();
        l1.topView(l1.root);
    }
}
