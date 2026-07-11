// Name: Muhammad Ahmer, Roll No.: 2022F-BSE-165
package searchingintree;
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
    public boolean search(int key) {
        return searchRec(root, key);
    }
    private boolean searchRec(TreeNode root, int key) {
        if (root == null || root.data == key) {
            return root != null;
        }
        if (key < root.data) {
            return searchRec(root.left, key);
        } else {
            return searchRec(root.right, key);
        }
    }
    public void delete(int key) {
        root = deleteRec(root, key);
    }
    private TreeNode deleteRec(TreeNode root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.data) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.data) {
            root.right = deleteRec(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
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
public class SearchingInTree {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(9);
        bst.insert(17);
        bst.insert(20);
        bst.insert(11);
        bst.insert(6);
        bst.insert(19);
        bst.insert(3);
        int searchItem = 20;
        System.out.println("Is " + searchItem + " present in the tree? " 
                + bst.search(searchItem));
        int deleteItem = 11;
        bst.delete(deleteItem);
        System.out.println("After deleting " + deleteItem + ", is " + 
                deleteItem + " present in the tree? " + bst.search(deleteItem));
        int newItem = 60;
        bst.insert(newItem);
        System.out.println("After inserting " + newItem + ", is " + 
                newItem + " present in the tree? " + bst.search(newItem));
    }
}
