package javapractice;


public class BinarySearchTree {

    Node root;

    public void insert(int data) {
        if (root == null)
            this.root = new Node(data);
        else root.insert(data);
    }

    public static void preorderTraversal(Node node) {
        if (node != null) {
            System.out.println(node.data);
            preorderTraversal(node.leftChild);
            preorderTraversal(node.rightChild);
        }
    }

    //postorder traversal (depth first)
    public static void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.leftChild);
            postorderTraversal(node.rightChild);
            System.out.println(node.data);
        }
    }
    public static void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.leftChild);
            System.out.println(node.data);
            printInOrder(node.rightChild);
        }
    }

    //level order traversal (breadth first)
    public static void levelorderTraversal(Node node) {
        int i;
        int h = findHeight(node);
        for (i = 1; i <= h; i++)
            printLevel(node, i);
    }

    static void printLevel(Node node, int level) {
        if (node == null)
            return;
        if (level == 1)
            System.out.println(node.data);
        else if (level > 1) {
            printLevel(node.leftChild, level - 1);
            printLevel(node.rightChild, level - 1);
        }
    }

    static int findHeight(Node node) {
        if (node == null)
            return 0;
        else {
            int lheight = findHeight(node.leftChild);
            int rheight = findHeight(node.rightChild);

            if (lheight > rheight)
                return (lheight + 1);
            else return (rheight + 1);
        }
    }

    //find lowest common ancestor btw two nodes
    static Node findLowestNode(Node node, int n1, int n2) {
        if (node == null || node.leftChild == null || node.rightChild == null)
            return null;
        // review optionals; off nullable (optional.empty)
        // djikstra's algorithm
        // breadth first search
        // heaps & heaps sort
        // sorting algorithms (bubble, heap, insertion sort)
        // graphs - start with graphs*
        // if both integers are smaller than the root, lowest common ancestor will be on the left
        if (node.data > n1 && node.data > n2)
            return findLowestNode(node.leftChild, n1, n2);
        // if both integers are greater than the root, lowest common ancestor will be on the right
        if (node.data < n1 && node.data < n2)
            return findLowestNode(node.rightChild, n1, n2);
        return node;
        }

        BinarySearchTree() {
        root = null;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(7);
        System.out.println("Pre order Traversal");
        preorderTraversal(tree.root);
        System.out.println("Post order Traversal");
        postorderTraversal(tree.root);
        System.out.println("Level order Traversal");
        levelorderTraversal(tree.root);
        System.out.println("In order traversal");
        printInOrder(tree.root);
        System.out.println("Lowest common ancestor between two nodes");
        int n1 = -1; int n2 = -7;
        Node lowestNode = findLowestNode(tree.root, n1, n2);

    }

    /*
    Insert to a binary search tree - DONE

    depth first:
    Preorder - root node, then left subtree recursively, then right subtree recursively - 3 nodes: root, left, right
    (inorder - left, root, right)
    post order - left, right, root

    breadth first:
    level order - print nodes one by one starting from the root node
    find the lowest common ancestor between 2 nodes in the tree -
     */
    static class Node {

        int data;
        Node leftChild, rightChild;
        //Insert to a binary search tree - DONE
        public void insert(int data) {
            if (data >= this.data) {
                if (this.rightChild == null)
                    this.rightChild = new Node(data);
                else
                    this.rightChild.insert(data);
            } else {
                if (this.leftChild == null)
                    this.leftChild = new Node(data);
                else
                    this.leftChild.insert(data);
            }
        }
        public Node(int item) {
            data = item;
            leftChild = rightChild = null;
        }
    }
}
