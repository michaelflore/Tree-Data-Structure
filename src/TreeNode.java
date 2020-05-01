 public class TreeNode {
     //Fields
     private Object value;
     private TreeNode left;
     private TreeNode right;

     //Default constructor
     public TreeNode() {
         value = null;
         left = null;
         right = null;
     }

     //Overloaded constructor
     public TreeNode(Object val) {
         value  =  val;
         left  =  null;
         right  =  null;
     }

     //Other overloaded constructor
     public TreeNode(Object  val, TreeNode  l, TreeNode  r) {
         value = val;
         left = l;
         right = r;
     }

     //Copy constructor
     public TreeNode(TreeNode node) {
         value = node.value;
         left = node.left;
         right = node.right;
     }

     //Returns value of node
     public Object getValue() {
         return value;
     }

     //Returns left node
     public TreeNode getLeft() {
         return left;
     }

     //Returns right node
     public  TreeNode  getRight() {
         return right;
     }

     //Sets value of node
     public  void  setValue(Object val) {
         value = val;
     }

     //Sets left node
     public  void  setLeft(TreeNode l) {
         left = l;
     }

     //Sets right node
     public  void  setRight(TreeNode r) {
         right = r;
     }
}
