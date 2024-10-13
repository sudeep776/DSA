package Binary_Trees;

import com.sun.source.tree.Tree;

import java.util.*;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class Pair<K,V>{
    private K key;
    private V value;
    public Pair(K key,V value){
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

public class Vertical_order{
    private TreeNode root;
    public void createBinaryTree(){
        this.root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(10);
        root.left.left.right = new TreeNode(5);
        root.left.left.right.right = new TreeNode(6);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(10);
        root.right.left = new TreeNode(9);
    }

    public static void main(String[] args) {
        Vertical_order v1 = new Vertical_order();
        v1.createBinaryTree();
        List<List<Integer>> verticalTraversal = Vertical_order.findVertical(v1.root);
        System.out.println(verticalTraversal);
        printResult(verticalTraversal);
    }

    private static List<List<Integer>> findVertical(TreeNode root) {
        //check if null
        if(root==null) return  new ArrayList<>();
        //Map --- vertical , (level,Nodes) - consists of multiple nodes in a vertical,level
        Map<Integer, Map<Integer, TreeSet<Integer>>> nodes = new TreeMap<>();
        //Queue --- Node, (Vertical,Level) - each node and vertical and level
        Queue<Pair<TreeNode,Pair<Integer,Integer>>> todo = new LinkedList<>();
        //add root to the queue
        todo.add(new Pair<>(root,new Pair<>(0,0)));
        while(!todo.isEmpty()){
            Pair<TreeNode,Pair<Integer,Integer>> p = todo.poll();
            TreeNode temp = p.getKey(); // get the node
            int vertical = p.getValue().getKey(); // get the vertical pos
            int level = p.getValue().getValue(); // gets the level

            //check if the map has the same vertical
            Map<Integer, TreeSet<Integer>> levelMap= nodes.get(vertical);
            if(levelMap==null){
                levelMap = new TreeMap<>();
                nodes.put(vertical,levelMap);
            }

            //check if the inner map if level exists
            TreeSet<Integer> valueSet = levelMap.get(level);
            if(valueSet==null){
                valueSet = new TreeSet<>();
                levelMap.put(level,valueSet);
            }
            //add the node data
            valueSet.add(temp.data);

            //process left child
            if(temp.left!=null){
                todo.add(new Pair<>(temp.left,new Pair<>(vertical-1,level+1)));
            }
            //process right child
            if(temp.right!=null){
                todo.add(new Pair<>(temp.right,new Pair<>(vertical+1,level+1)));
            }
        }

        //prepare the final result
        List<List<Integer>> result = new ArrayList<>();
        for(Map.Entry<Integer,Map<Integer,TreeSet<Integer>>> e1 : nodes.entrySet()){
            List<Integer> col = new ArrayList<>();
            //in each vertical get the valuesSet
            for(TreeSet<Integer> set:e1.getValue().values()){
                col.addAll(set);
            } result.add(col);
        }return result;
    }
    private static void printResult(List<List<Integer>> result) {
        for (List<Integer> level : result) {
            for (int node : level) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}