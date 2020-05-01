public class BinarySearchTree extends BinaryTree {
    //Default constructor
    public BinarySearchTree() {
        super();
    }

    //Overloaded constructor with variable length parameter
    public BinarySearchTree(Comparable ...value) {
        super();
        if(value.length < 1) {
            System.out.println("No values sent");
        }
        else {
            for(Comparable element : value) {
                this.insert(element);
            }
        }
    }

    //Insert method
    public void insert(Comparable item) {
        setRoot(recurInsert(getRoot(), item));
    }

    //Recursive helper method to insert
    private TreeNode recurInsert(TreeNode t, Comparable item) {
        if (t == null) {
            return  new  TreeNode(item);
        }
        else if (item.compareTo(t.getValue())  <  0) {
            t.setLeft(recurInsert(t.getLeft(), item));
        }
        else {
            t.setRight(recurInsert(t.getRight(), item));
        }
        return  t;
    }
}
