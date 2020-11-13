package javapractice;

/**
 * 1. find the first element,
 * 2. find the last element
 * 3. append to the beginning of the list
 * 4. append to the end of the list
 * 5. delete an element of the list
 * understand time efficiency and tradeoffs with each
 */


public class DoublyLinkedList {

    private Node head;
    /**
     * Node head
     * previous pointer
     * next pointer
     * element
     */

    /**
     * return the first element of the doubly linked list
     */
    public Integer findFirst() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    /**
     * return the last element of the doubly linked list
     */
    public Integer findLast() {
        Node node = this.head;
        if (head == null) {
            return null;
        }
        while (node.next != null) {
            node = node.next;
        }
        return node.data;
    }

    /**
     * method insertFirst()
     * set previous pointer of Node head equal to the item I'm inserting
     */
     public Node insertFirst(Integer element) {
         Node node = new Node(element);
         if (head == null) {
             head = node;
             return node;
         }
         head.prev = node;
         node.next = head;
         head = head.prev;
         return node;
     }

     /**
     * method insertLast()
     *
     */
     public Node insertLast(Integer element) {
         Node node = new Node(element);
         if (head == null) {
             head = node;
             return node;
         }
         Node findaLastNode = head;
         while (findaLastNode.next != null) {
             findaLastNode = findaLastNode.next;
         }
         node.prev = findaLastNode;
         findaLastNode.next = node;
         return node;
     }

     /* public static void main(String args[]) {
        LinkedList doublyLinkedList = new LinkedList();
        doublyLinkedList.push(1);
        doublyLinkedList.push(2);
        doublyLinkedList.push(3);
        doublyLinkedList.push(4);
        findFirst(doublyLinkedList);
        findLast(doublyLinkedList);
        insertFirst(doublyLinkedList);
        insertLast(doublyLinkedList);
        deleteElement(doublyLinkedList);
    }
    */

    class Node {

        int data;
        Node prev;
        Node next;

        Node (int d) {
            data = d;
        }

    }
}
