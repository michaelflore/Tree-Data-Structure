public abstract class BinaryTree implements BT {
    //Fields
    private TreeNode root;

    //Default constructor
    public  BinaryTree() {
        root = null;
    }

    //Returns the root node
    public TreeNode getRoot() {
        return root;
    }

    //Sets the root node with the TreeNode obj passed in
    public void setRoot(TreeNode newNode) {
        root = newNode;
    }

    //Checks to see if tree is empty
    public boolean isEmpty() {
        return root == null;
    }

    //Swaps left and right subtrees
    public void swapSubtrees(TreeNode node) {
        if(node != null) {
            TreeNode temp = node.getLeft();
            node.setLeft(node.getRight());
            node.setRight(temp);
            swapSubtrees(node.getLeft());
            swapSubtrees(node.getRight());
        }
    }

    //Returns number of nodes in the tree which have only one child
    public int singleParent() {
        return checkNode(root, 0);
    }

    //Helper method to singleParent()
    private int checkNode(TreeNode node, int count) {
        if(node == null || (node.getLeft() == null && node.getRight() == null)) {
            return count;
        }
        count = checkNode(node.getLeft(), count);
        if(node.getLeft() == null || node.getRight()==null) {
            count++;
        }
        count = checkNode(node.getRight(), count);
        return count;
    }

    //PreOrder traversal of tree
    public void preOrder(TreeNode node, int lvl, StringBuilder sb) {
        if(node != null) {
            sb.append(node.getValue()).append(" at Level ").append(lvl).append("\n");
            preOrder(node.getLeft(), lvl + 1, sb);
            preOrder(node.getRight(), lvl + 1, sb);
        }
    }

    //Inorder traversal of tree
    public void inOrder(TreeNode node, int lvl, StringBuilder sb) {
        if(node != null) {
            inOrder(node.getLeft(), lvl + 1, sb);
            sb.append(node.getValue()).append(" at Level ").append(lvl).append("\n");
            inOrder(node.getRight(), lvl + 1, sb);
        }
    }

    //PostOrder traversal of tree
    public void postOrder(TreeNode node, int lvl, StringBuilder sb) {
        if(node != null) {
            postOrder(node.getLeft(), lvl + 1, sb);
            postOrder(node.getRight(), lvl + 1, sb);
            sb.append(node.getValue()).append(" at Level ").append(lvl).append("\n");
        }
    }

    //Abstract insert method, inserts items into tree
    public abstract void insert(Comparable item);

    //Overridden toString method
    public String toString() {
        StringBuilder build = new StringBuilder();
        inOrder(root, 1, build);
        return build.toString() + "Number of single parents: " + singleParent();
    }
}
