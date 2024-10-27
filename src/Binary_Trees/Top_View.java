package Binary_Trees;

import java.util.*;


public class Top_View {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            this.data=data;
            this.left= null;
            this.right=null;
        }
    }
    static class Pair<K,V>{
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


    public void topView(TreeNode root){
        //Queue - to traverse the tree - node and vertical
        //Map - to keep vertical and nodes
        Queue<Pair<Integer,TreeNode>> todo = new LinkedList<>();
        Map<Integer,Integer> nodes = new TreeMap<>(); // vertical to node mapping
        todo.add(new Pair<>(0, root));
        while(!todo.isEmpty()){
            Pair<Integer,TreeNode> p = todo.poll();
            int vertical = p.getKey();
            TreeNode temp = p.getValue();

            //search it in the map if exists
            //for top view  --
            //for bottom view -- overwrite it so that
//            if(!nodes.containsKey(vertical)){
//                nodes.put(vertical,temp.data);
//            }
            nodes.put(vertical,temp.data);
            if(temp.left!=null){
                todo.add(new Pair<>(vertical - 1, temp.left));
            }
            if(temp.right!=null){
                todo.add(new Pair<>(vertical + 1, temp.right));
            }
        }
        System.out.println(nodes.values());
    }

    public static void main(String[] args) {
        Top_View l1 = new Top_View();
        l1.createBinaryTree();
        l1.topView(l1.root);
    }
}
