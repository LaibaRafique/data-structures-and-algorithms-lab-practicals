// Name: Laiba Rafiq, Roll Number: 2022F-BSE-064
package searchinsertdeletetree;
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
    public boolean search(int key) {
        return search(root, key);
    }
    private boolean search(TreeNode root, int key) {
        if (root == null || root.data == key) {
            return root != null;
        }

        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
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
    public void delete(int key) {
        root = delete(root, key);
    }
    private TreeNode delete(TreeNode root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }
    private int minValue(TreeNode root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }
}
public class SearchInsertDeleteTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(21);
        tree.insert(11);
        tree.insert(9);
        tree.insert(0);
        tree.insert(35);
        tree.insert(4);
        tree.insert(12);
        int searchItem = 9;
        if (tree.search(searchItem)) {
            System.out.println("Item " + searchItem + " found in the tree.");
        } else {
            System.out.println("Item " + searchItem + " not found in the tree.");
        }
        int deleteItem = 4;
        tree.delete(deleteItem);
        System.out.println("Item " + deleteItem + " deleted from the tree.");
        if (tree.search(deleteItem)) {
            System.out.println("Item " + deleteItem + " found in the tree.");
        } else {
            System.out.println("Item " + deleteItem + " not found in the tree.");
        }
    }
}
