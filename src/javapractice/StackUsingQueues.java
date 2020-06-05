/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import java.util.*;

/**
 *
 * @author msima
 */
//implement a stack using 2 queues
public class StackUsingQueues {
    
    //instantiate 2 queues
    Queue<Integer> q1 = new PriorityQueue<Integer>();
    Queue<Integer> q2 = new PriorityQueue<Integer>();
    
    //push int a to the second queue
    public void push(int a) {
        q1.add(a);
    }
    //one by one, dequeue all elements from q1 and enqueue them to the second 
    //queue.
    //dequeue an item from q1 and return item
    public int pop() {
        if (q1.isEmpty()) {
            return Integer.MIN_VALUE;
        }
        while (q1.size() != 1) {
            int top = q1.remove();
            q2.add(top);
        }
        int poppedElement = q1.remove();
        Queue<Integer> temp = q2;
        q2 = q1;
        q1 = temp;
        return poppedElement;
    }
    
    public static void main(String[] args) {
        StackUsingQueues testStack = new StackUsingQueues();
        System.out.println(testStack.pop());
        testStack.push(1);
        testStack.push(2);
        testStack.push(3);
        System.out.println(testStack.pop());
        System.out.println(testStack.pop());
        System.out.println(testStack.pop());
        System.out.println(testStack.pop());
    }
}