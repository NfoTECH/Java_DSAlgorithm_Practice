package assessmentDay;

//A tree is composed of nodes which follow these rules:
//
//        A node holds a value corresponding to an integer.
//
//        Except for the root node of the tree, a node is always referenced by only one
//
//        other node. A node has no more than two children. They are called left child and right
//
//        child If a node has no right or left child, the corresponding reference is null
//
//        All the descendants to the left of a node are smaller than the node and all the descendants to the right of the node are greater than the node.
//
//        Here is an example of such a tree (the root node holds the integer 9)
//
//        To simplify things, we combine everything into a single class named Mode
//
//        The height of the tree is between 0 and 100 000 nodes (the height of a tree is the length of the path from the root to the deepest node in the tree).
//
//        Question: Implement a new Node's method named rind(int v) which returns the node holding the value of If the node doesn't exist then rind should return
//
//        mull
//
//        Important note: Try to save memory (RAM) space.
//
//        To test your solution you can use two examples of tree:
//
//        The variable all corresponds to the root node of the tree from Fig. 1.
//
//        The variable large corresponds to the root node of a tree of height 100 000 nodes. The deepest node holds the value 100 000.

public class Node {
    private int value;
    private Node left;
    private Node right;

    public Node find(int v) {
        Node current = this;
        while (current != null) {
            if (v == current.value) {
                return current;
            } else if (v < current.value) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return null;
    }
}
