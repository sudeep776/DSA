package Binary_Trees;

import java.util.ArrayList;
import java.util.List;

public class Right_View {
    private TreeNode root;

    public class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    private void createBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);

        root = first;
        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;

        third.left = sixth;
        third.right = seventh;
    }

    public List<Integer> rightsideView(TreeNode root) {
        // List to store the result
        List<Integer> res = new ArrayList<>();

        // Call the recursive function to populate the right-side view
        recursionRight(root, 0, res);

        return res;
    }

    private void recursionRight(TreeNode root, int level, List<Integer> res) {
        if (root == null) return;

        // If the size of the result list is equal to the current level,
        // add the node's data to the result
        if (res.size() == level) {
            res.add(root.data);
        }

        // First go to the right child, then to the left
        recursionRight(root.right, level + 1, res);
        recursionRight(root.left, level + 1, res);
    }

    public static void main(String[] args) {
        Right_View p1 = new Right_View();
        p1.createBinaryTree();
        List<Integer> res = p1.rightsideView(p1.root);
        for (Integer a1 : res) {
            System.out.println(a1);
        }
    }
}
