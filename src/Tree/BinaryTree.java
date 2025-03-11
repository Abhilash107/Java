package Tree;

import com.sun.jdi.IncompatibleThreadStateException;

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

    public boolean isSymmetric(Node root) {
        if(root == null)return true;

        return isSymmetricHelper(root.left, root.right);
    }


    public boolean isSymmetricHelper(Node root1, Node root2) {
        if(root1 == null || root2 == null) return root1 == root2;

        return  (root1.data == root2.data)
                && isSymmetricHelper(root1.left, root.right)
                && isSymmetricHelper(root1.right, root2.left);

    }


    public void makeParents(Node root, Map<Node, Node> parentTrack, Node target){
        Queue<Node> q = new LinkedList<>();

        q.offer(root);

        while (!q.isEmpty()){
            Node node = q.poll();

            if(node.left != null) {
                parentTrack.put(node.left, node);
                q.offer(node.left);
            }

            if(node.right != null) {
                parentTrack.put(node.right, node);
                q.offer(node.right);
            }
        }
    }


    public List<Integer> distanceK (Node root, Node target, int k){
        Map<Node, Node> map = new HashMap<>();
        makeParents(root, map, target);

        Map<Node, Boolean> visited = new HashMap<>();

        Queue<Node> q = new LinkedList<>();

        q.offer(target);
        visited.put(target, true);

        int level = 0;

        while(!q.isEmpty()) {
            int size = q.size();
            if(level == k) break;
            level++;

            for(int i = 0; i < size;i++){
                Node node = q.poll();
                if(node.left != null && visited.get(node.left) == null){
                    q.offer(node.left);
                    visited.put(node.left, true);
                }

                if(node.right != null && visited.get(node.right) == null){
                    q.offer(node.right);
                    visited.put(node.right, true);
                }

                if(map.get(node) != null && visited.get(map.get(node)) == null){
                    q.offer(map.get(node));
                    visited.put(map.get(node), true);
                }

            }
        }

        List<Integer> res = new ArrayList<>();
        while(!q.isEmpty()){
            Node node = q.poll();
            res.add(node.data);
        }

        return  res;
    }

    public List<Double> averageOfLevels(Node root) {
        List<Double> ans = new ArrayList<>();

        if(root == null) return ans;

        Queue<Node> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            double sum = 0;

            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                sum += node.data;

                if(node.left != null)q.offer(node.left);
                if(node.right != null)q.offer(node.right);

            }

            ans.add(sum / size);
        }

        return ans;
    }

    public Node buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);

        }

        Node newNode = buildTree(preorder, 0, preorder.length -1, inorder, 0, inorder.length - 1, map);

        return newNode;
    }

    public Node buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> map){
        Node node = new Node(preorder[preStart]);
        if (preStart > preEnd || inStart > inEnd) return null;


        int inRoot = map.get(node.data);// get data
        int leftNums = inRoot - preStart;

        node.left = buildTree(preorder, preStart + 1, preStart + leftNums + 1, inorder, inStart, inRoot - 1, map);
        node.right = buildTree(preorder, preStart + leftNums + 1, preEnd, inorder, inRoot + 1, preEnd, map);

        return node;

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
