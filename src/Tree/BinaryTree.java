package Tree;

import java.util.*;

class Tuple{
    Node node;
    int row, col;
    public Tuple(Node n, int r, int c) {
        node = n;
        row = r;
        col =c;

    }
}

class Pair{
    Node node;
    int line;
    public Pair(Node n, int line) {
        this.node = n;
        this.line = line;
    }
}

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

    int maxDepth(Node node) {
        if(node == null)return 0;

        int lh = maxDepth(node.left);
        int rh = maxDepth(node.right);

        if(Math.abs(rh - lh) > 1)return -1;
        if(lh == -1 || rh == -1)return -1;


        return 1 + Math.max(lh, rh);

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
                Node node = queue.poll();

                if (node.left != null) queue.offer(node.left);//get the left node
                if (node.right != null) queue.offer(node.right);//get the right node
                subList.add(node.data);//also add the visited node to the sublist
            }
            res.add(subList);//add sublist to the res

        }
        return res;


    }


    List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)return res;

        boolean leftToRight = true;
        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();

            List<Integer> subList = new ArrayList<>();

            for(int i = 0; i < size;i++){
                Node node = queue.poll();

                if(leftToRight){//checking the direction
                    subList.add(node.data);
                }
                else{
                    subList.add(0, node.data);
                }

                if(node.left != null)queue.offer(node.left);//Adding to queue
                if(node.right != null)queue.offer(node.right);
            }
            res.add(subList);
            leftToRight = !leftToRight;//set the direction flag

        }
        return res;


    }

    //IMP
    List<List<Integer>> verticalTraversal(Node root){
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();

        Queue<Tuple> queue = new LinkedList<>();
        queue.offer(new Tuple(root, 0 , 0));//node, vertical line , level
        while(!queue.isEmpty()){
            Tuple tuple = queue.poll();
            Node node = tuple.node;
            int x = tuple.row, y = tuple.col;

            if(!map.containsKey(x)){//Outer TreeMap key check and put
                map.put(x, new TreeMap<>());
            }

            if(!map.get(x).containsKey(y)){//Inner treemap check and put
                map.get(x).put(y, new PriorityQueue<>());
            }

            map.get(x).get(y).offer(node.data);

            if(node.left != null)queue.offer(new Tuple(node.left, x - 1, y + 1 ));
            if(node.right != null)queue.offer(new Tuple(node.right, x + 1, y + 1 ));
        }

        List<List<Integer>> list = new ArrayList<>();
        for(TreeMap <Integer, PriorityQueue<Integer>> ans: map.values()){
            list.add(new ArrayList<>());
            for(PriorityQueue<Integer> nodes: ans.values()){
                while(!nodes.isEmpty()){
                    list.get(list.size() - 1).add(nodes.poll());
                }
            }
        }
        return list;
    }

    //L IMP
    List<Integer> topView(Node root){
        List<Integer> res = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        if(root == null)return res;

        Map<Integer, Integer> map = new TreeMap<>();//map to store line and node

        q.offer(new Pair(root, 0));//add the root to the queue

        while(!q.isEmpty()){
            Pair p = q.poll();//get the node from queue and extract details
            int line = p.line;
            Node node = p.node;

            if(!map.containsKey(line))map.put(line, node.data);//check if present in map or not
            if(node.left != null)q.offer(new Pair(node.left, line - 1));//get left node if nay present
            if(node.right != null)q.offer(new Pair(node.right, line + 1));//get right node if nay present

        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            res.add(entry.getValue());//add to the res list;
        }

        return res;
    }


    List<Integer> BottomView(Node root){
        List<Integer> res = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        if(root == null)return res;

        Map<Integer, Integer> map = new TreeMap<>();//map to store line and node

        q.offer(new Pair(root, 0));//add the root to the queue

        while(!q.isEmpty()){
            Pair p = q.poll();//get the node from queue and extract details
            int line = p.line;
            Node node = p.node;

            map.put(line, node.data);
            //check if present in map or not
            if(node.left != null)q.offer(new Pair(node.left, line - 1));//get left node if nay present
            if(node.right != null)q.offer(new Pair(node.right, line + 1));//get right node if nay present

        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            res.add(entry.getValue());//add to the res list;
        }

        return res;
    }

    List<Integer> rightSideView(Node root) {
        List<Integer> res = new ArrayList<>();

        getRightNode(root, res, 0);

        return res;

    }

    //reverse preOrder ==> Root -> Right -> Left(IMP)
    public void getRightNode(Node root, List<Integer> res, int level){
        if(root == null)return;

        if(level == res.size())res.add(root.data);

        getRightNode(root.right, res, level + 1);
        getRightNode(root.left, res, level + 1);

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
