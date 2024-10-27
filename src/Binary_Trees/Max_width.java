package Binary_Trees;

import java.util.LinkedList;
import java.util.Queue;

class Pair1<K,V>{
    K key;
    V value;
    public Pair1(K key,V value){
        this.key=key;
        this.value=value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
public class Max_width {
    private TreeNode root;

    public void createBinaryTree() {
        this.root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(8);
        root.right.right = new TreeNode(4);
    }

    public static void main(String[] args) {
        Max_width m1 = new Max_width();
        m1.createBinaryTree();
        int res = m1.width(m1.root);
        System.out.println(res);
    }

    private int width(TreeNode root) {
        Queue<Pair<TreeNode, Integer>> todo = new LinkedList<>();
        todo.add(new Pair<>(root,0));
        int ans=0;
        while (!todo.isEmpty()) {
            int mmin = todo.peek().getValue();
            int size = todo.size();
            int first=0;
            int last=0;
            for(int i=0;i<size;i++){
                Pair<TreeNode,Integer> p=todo.poll();
                TreeNode node = p.getKey();
                int cur_id = p.getValue()-mmin;

                if(i==0)first = cur_id;
                if(i==size-1) last = cur_id;

                if(node.left!=null) todo.add(new Pair<>(node.left,2*cur_id+1));
                if(node.right!=null) todo.add(new Pair<>(node.right,2*cur_id+2));
            }
            ans=Math.max(ans,last-first+1);
        }return ans;
    }
}
