// Name: Laiba Rafiq, Roll Number: 2022F-BSE-064
package binarysearchtree;
class TreeNode {
    int data;
    TreeNode left, right;
    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}
class BinaryTree {
    private TreeNode root;
    public BinaryTree() {
        root = null;
    }
    public void insert(int key) {
        root = insert(root, key);
    }
    private TreeNode insert(TreeNode root, int key) {
        if (root == null) {
            root = new TreeNode(key);
            return root;
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        return root;
    }
    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }
}
public class BinarySearchTree {
    public static void main(String[] args) {
        int[] elements = {-45, 15, 79, 90, 10, 55, 12, 20, 50};
        BinaryTree tree = new BinaryTree();
        for (int element : elements) {
            tree.insert(element);
        }
        System.out.println("In-order traversal of the binary search tree: ");
        tree.inOrderTraversal();
        System.out.println("");
    }
}
