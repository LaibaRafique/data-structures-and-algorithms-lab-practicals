// Name: Muhammad Ahmer, Roll No.: 2022F-BSE-165
package mergebst;
class TreeNode {
    int val;
    TreeNode left, right;
    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
public class MergeBST {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(5);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(11);
        TreeNode root2 = new TreeNode(8);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(4);
        TreeNode mergedBST = mergeBST(root1, root2);
        System.out.println("Merged BST:");
        printInorder(mergedBST);
    }
    public static TreeNode mergeBST(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        TreeNode mergedRoot = new TreeNode(root1.val + root2.val);
        mergedRoot.left = mergeBST(root1.left, root2.left);
        mergedRoot.right = mergeBST(root1.right, root2.right);

        return mergedRoot;
    }
    public static void printInorder(TreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(root.val + " ");
            printInorder(root.right);
        }
    }
}
