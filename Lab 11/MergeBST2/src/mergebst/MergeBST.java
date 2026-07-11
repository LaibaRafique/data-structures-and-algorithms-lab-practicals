// Name: Laiba Rafiq, Roll Number: 2022F-BSE-064
package mergebst;
import java.util.ArrayList;
import java.util.List;
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}
public class MergeBST {
    public static void mergeBSTs(Node root1, Node root2) {
        List<Node> nodeList1 = new ArrayList<>();
        inOrderTraversal(root1, nodeList1);
        List<Node> nodeList2 = new ArrayList<>();
        inOrderTraversal(root2, nodeList2);
        List<Node> mergedList = mergeLists(nodeList1, nodeList2);
        Node mergedRoot = buildBST(mergedList, 0, mergedList.size() - 1);
        System.out.println("Nodes of the merged BST:");
        printInOrder(mergedRoot);
    }
    private static void inOrderTraversal(Node root, List<Node> nodeList) {
        if (root != null) {
            inOrderTraversal(root.left, nodeList);
            nodeList.add(root);
            inOrderTraversal(root.right, nodeList);
        }
    }
    private static List<Node> mergeLists(List<Node> list1, List<Node> list2) {
        List<Node> mergedList = new ArrayList<>();
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).data < list2.get(j).data) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }
        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
    private static Node buildBST(List<Node> nodeList, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = nodeList.get(mid);

        root.left = buildBST(nodeList, start, mid - 1);
        root.right = buildBST(nodeList, mid + 1, end);

        return root;
    }
    private static void printInOrder(Node root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.print(root.data + " ");
            printInOrder(root.right);
        }
    }
    public static void main(String[] args) {
        Node root1 = new Node(7);
        root1.left = new Node(5);
        root1.right = new Node(9);
        Node root2 = new Node(11);
        root2.left = new Node(3);
        root2.right = new Node(14);
        mergeBSTs(root1, root2);
    }
}
