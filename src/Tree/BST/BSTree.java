package Tree.BST;

import java.util.ArrayList;
import java.util.List;

class Node {
    int val;
    Node left, right;

    Node(int n ){
        this.val = n;
        left = right = null;

    }
}
public class BSTree {


    Node root;

    public static int getMax(Node root){

        List<Integer> list = new ArrayList<>();
        inOrderHehe(root, list);

        return list.get(list.size() - 1);
    }
    public static int getMin(Node root){

        List<Integer> list = new ArrayList<>();
        inOrderHehe(root, list);

        return list.get(0);
    }

    public static void inOrder(Node root){

        if(root == null) return;
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);

    }

    public static void inOrderHehe(Node root, List<Integer> list){
        if (root == null) return;

        inOrderHehe(root.left, list);
        list.add(root.val);
        inOrderHehe(root.right, list);

    }

    public static void main(String[] args) {

        BSTree tree = new BSTree();
        tree.root = new Node(8);
        tree.root.left = new Node(3);
        tree.root.right = new Node(10);
        tree.root.right.left = new Node(9);

        //inOrder(tree.root);

        System.out.println(getMax(tree.root));
        System.out.println(getMin(tree.root));


    }
}
