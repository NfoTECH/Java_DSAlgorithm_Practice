package assessmentDay;


//Given a binary tree. And its maximum depth
//
//        The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node
//        Note: A teal is a node with no children.
//
//        Example:
//
//        Oven binary thee [3,9,20,null,null,15,7]
//        3
//        / \
//        9  20
//        /  \
//        15   7
//
//        return its depth=3

public class BinaryTreeMaxDepth {
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

    class TreeNode {
        int[] val1 = new int[10];
        

        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        BinaryTreeMaxDepth t = new BinaryTreeMaxDepth();
        TreeNode root = t.new TreeNode(3);
        root.left =t.new TreeNode(9);
        root.right = t.new TreeNode(20);
        root.right.left = t.new TreeNode(15);
        root.right.right = t.new TreeNode(7);
        System.out.println(maxDepth(root));
    }
}
