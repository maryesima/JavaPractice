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
public class QueueUsingStacks {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void enQueue(int x) {
        
        while (! stack1.empty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(x); {
        while (! stack2.empty()) {
            stack1.push(stack2.pop());
        }
        stack2.push(x);
        }
    }
    public Integer deQueue() {
        if (stack1.empty()) {
            System.out.println("Error");
            return null;
        }
        return stack1.pop();
    }
    
    public static void main(String[] args) {
        QueueUsingStacks testQueue = new QueueUsingStacks();
        testQueue.enQueue(1);
        testQueue.deQueue();
    }
}
//for enQueue: go through all elements of the first stack, and then
//remove each one individually, then add them back one by one to the new stack
//
