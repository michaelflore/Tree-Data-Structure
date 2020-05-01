public class TreeDemo {
    public static void main(String[] args) {
        /* Unsure about first one because
         * the diagram given is not a BST (no particular ordering).
         * From my understanding, when represented in a BST,
         * the values in the diagram would produce an unbalanced
         * (right-heavy) BST, so my program shows it as such
         */
        System.out.println("Tree One: ");
        BinarySearchTree treeOne = new BinarySearchTree();
        makeTree(treeOne); //inserts values
        printTree(treeOne); //prints tree BEFORE swap
        treeOne.swapSubtrees(treeOne.getRoot()); //swap left and right subtrees
        printTree(treeOne); //prints tree AFTER swap

        System.out.println("\nTree Two: ");
        BinarySearchTree treeTwo = new BinarySearchTree(14, 4, 15, 3, 9, 18, 7, 16, 20, 5, 17);
        printTree(treeTwo); //prints tree BEFORE swap
        treeTwo.swapSubtrees(treeTwo.getRoot()); //swap left and right subtrees
        printTree(treeTwo); //prints tree AFTER swap
    }

    //Insertions for treeOne (insertions already made during instantiation for treeTwo)
    public static void makeTree(BinarySearchTree tree) {
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
    }

    //Prints out tree
    public static void printTree(BinarySearchTree tree) {
        System.out.println(tree);
    }
}
