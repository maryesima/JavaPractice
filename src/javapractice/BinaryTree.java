package javapractice;


public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.right = new Node(4);
        printInOrder(tree.root);
    }

    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }

        /* Given a binary tree, print its nodes in inorder
            1. Traverse the left subtree, i.e., call Inorder(left-subtree)
            2. Visit the root.
            3. Traverse the right subtree, i.e., call Inorder(right-subtree)
         */
      }
    static void printInOrder(Node node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.println(node.data);
        printInOrder(node.right);
      }
    }
