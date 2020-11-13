/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;
/**
 *
 * @author msima
 */
class Node {
    int data; 
    Node next; 
    Node(int d)  { data = d;  next = null; } 
} 

class LinkedList<I extends Number> {
    Node head;
    
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public int getCount() {
        int[] ans = new int[2];
        Node temp = head;
        Node middle = head;
        int count = 0;
        
        while (temp != null) {
          count++;
          if(count%2 == 0) {
              middle = middle.next;
          }
          temp = temp.next;
        }
        return count;
    }
    public int getMiddle(int count) {
        int middle = (int)count/2;
        Node temp = head;
        while(middle >0) {
            temp = temp.next;
            -- middle;
        }
        return temp.data;
    }
    public static void main(String[] args) {

        LinkedList<Number> testList = new LinkedList<Number>();
        testList.push(1);
        testList.push(2);
        testList.push(3);
        System.out.println("Count of nodes is " + testList.getCount());
        System.out.println("Middle of the nodes is: " + testList.getMiddle(testList.getCount()));
    }
}
