public interface BT {
    //Returns the root node
     TreeNode getRoot();
    //Sets the root node with the TreeNode obj passed in
     void setRoot(TreeNode newNode);
    //Checks to see if tree is empty
     boolean isEmpty();
    //Swaps left and right subtrees
     void swapSubtrees(TreeNode node);
    //Returns number of nodes in the tree which have only one child
     int singleParent();
    //PreOrder traversal of tree
     void preOrder(TreeNode node, int lvl, StringBuilder sb);
    //Inorder traversal of tree
     void inOrder(TreeNode node, int lvl, StringBuilder sb);
    //PostOrder traversal of tree
     void postOrder(TreeNode node, int lvl, StringBuilder sb);
    //Inserts items into tree
     void insert(Comparable item);
}
