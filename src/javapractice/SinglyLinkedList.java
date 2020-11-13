package javapractice;

/**
* 1. find the first element,
* 2. find the last element
* 3. append to the beginning of the list
* 4. append to the end of the list
* 5. delete an element of the list
* understand time efficiency and tradeoffs with each
*/

public class SinglyLinkedList {

    private Node head;
    private int size = 0;


    /**
     * return the first element of the list
     */
    public Integer findFirst() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    /**
     * return the last element of the list
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
     * insert element to the front of the list
     * @param element is a integer
     */
    public Node insertFirst(int element) {
        Node node = new Node(element, head);
        head = node;
        size++;
        return node;
    }

    /**
     * insert element to the end of the list
     * @param element is a integer
     */
    public Node insertLast(int element) {
        Node lastNode = new Node(element);
        Node node = this.head;
        if (node == null) {
            head = lastNode;
            size++;
        }
        else {
            while (node.next != null) {
                node = node.next;
            }
            node.next = lastNode;
            size++;
        }
        return lastNode;
        //System.out.println("The new list is " + singlyLinkedList);
    }

    /**
     * remove a node
     */
    public void deleteNode(Node nodeToRemove) {
        Node node = this.head;
        if (node == null) {
            return;
        }
        if (node == nodeToRemove) {
            head = node.next;
            size--;
            return;
        }
        while (node.next != nodeToRemove) {
            node = node.next;
        }
        node.next = nodeToRemove.next;
        size--;
    }
    //is this needed?
    public static void main(String args[]) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Node lastNode = singlyLinkedList.insertLast(10);
        singlyLinkedList.findFirst();
        singlyLinkedList.findLast();
        singlyLinkedList.insertFirst(5);
        singlyLinkedList.insertLast(3);
        singlyLinkedList.deleteNode(lastNode);
    }

    /**
     * cases for findFirst & findLast
     *      1. edge case of list being empty
     *      2. insertFirst of 2; findFirst should return 2; findLast should return 2;
     *      3. insertLast of 3; findFirst should return 2; findLast should return 3;
     *      4. deleteNode 2; then firstFirst should return 3; findLast should return 3;
     */

    /**
     * cases for deleteNode
     *      1. if list is empty, function doesn't throw error
     *      2. insertFirst 2,3,4...
     *      3. deleteNode of 2; check that the size of the list has decreased by 1
     *      4. if deleteNode of 5, then size does not change
     */

    /**
     * add optional method
     * deleteAll of 2 - deletes all 2s in the list
     */

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

    }

}



