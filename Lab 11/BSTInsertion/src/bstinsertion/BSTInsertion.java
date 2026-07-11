// Name: Muhammad Ahmer, Roll No.: 2022F-BSE-165
package bstinsertion;
class TreeNode {
    int data;
    TreeNode left, right;
    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}
class BinarySearchTree {
    private TreeNode root;
    public BinarySearchTree() {
        root = null;
    }
    public void insert(int key) {
        root = insertRec(root, key);
    }
    private TreeNode insertRec(TreeNode root, int key) {
        if (root == null) {
            root = new TreeNode(key);
            return root;
        }
        if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else if (key > root.data) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }
    public void inorder() {
        inorderRec(root);
    }
    private void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
}
public class BSTInsertion {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] elements = {-45, 15, 79, 90, 10, 55, 12, 20, 50};
        for (int element : elements) {
            bst.insert(element);
        }
        System.out.println("Elements in sorted order:");
        bst.inorder();
        int newElement = 60;
        bst.insert(newElement);
        System.out.println("\nElements after inserting " + newElement + 
                " in sorted order:");
        bst.inorder();
    }
}
