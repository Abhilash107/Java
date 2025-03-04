package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node{
    int data;
    Node left, right;

    public Node(int item){
        this.data = item;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    void preorder(Node node){
        if(node == null)return;
        System.out.print(node.data+ " ");
        preorder(node.left);
        preorder(node.right);

    }

    void inorder(Node node){
        if(node == null)return;
        inorder(node.left);
        System.out.print(node.data+ " ");
        inorder(node.right);

    }

    void postorder(Node node){
        if(node == null)return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+ " ");


    }

    List<List<Integer>> levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<List<Integer>>();

        if(root == null) return res;

        queue.offer(root);//add root to the queue
        while(!queue.isEmpty()){//check if not empty
            int size = queue.size();

            List<Integer> subList = new LinkedList<>();//sublist to store nodes on each level
            for(int i = 0;i < size;i++){
                if(queue.peek().left != null)queue.offer(queue.peek().left);//get the left node
                if(queue.peek().right != null)queue.offer(queue.peek().right);//get the right node
                subList.add(queue.poll().data);//also add the visited node to the sublist
            }
            res.add(subList);//add sublist to the res

        }
        return res;


    }


    int maxDepth(Node node) {
        if(node == null)return 0;

        int lh = maxDepth(node.left);
        int rh = maxDepth(node.right);

        if(Math.abs(rh - lh) > 1)return -1;
        if(lh == -1 || rh == -1)return -1;


        return 1 + Math.max(lh, rh);

    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right= new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);


        tree.inorder(tree.root);
        System.out.println("\n");
        tree.preorder(tree.root);
        System.out.println("\n");
        tree.postorder(tree.root);
    }
}
