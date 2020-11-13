package javapractice;

import java.util.*;

public class StackUsingQueuesV2 {

    Queue<Integer> q1v2 = new PriorityQueue<Integer>();
    Queue<Integer> q2v2 = new PriorityQueue<Integer>();

    //one by one, dequeue all elements from q1 and enqueue them to the second
    //queue.
    //dequeue an item from q1 and return item
    public void push(int a) {
        while (! q1v2.isEmpty()) {
            q2v2.add(q1v2.remove());
        }
        int poppedElement = q1v2.remove();
        Queue<Integer> temp = q2v2;
        q2v2 = q1v2;
        q1v2 = temp;
        //return poppedElement;
    }

    //pop int a to the second queue
    public void pop(int a) {
        q2v2.add(a);
    }

    public static void main(String[] args) {
        StackUsingQueues testStack = new StackUsingQueues();
        testStack.push(1);
        System.out.println(testStack);
        testStack.pop();
        testStack.pop();
        testStack.pop();
        testStack.push(2);
        System.out.println(testStack);
        testStack.push(3);
        System.out.println(testStack);
        testStack.push(4);
        System.out.println(testStack);
    }
}

//    public void enQueue(int x) {
//
//        while (! stack1.empty()) {
//            stack2.push(stack1.pop());
//        }
//        stack1.push(x); {
//            while (! stack2.empty()) {
//                stack1.push(stack2.pop());
//            }
//            stack2.push(x);
//        }
//    }
//    public Integer deQueue() {
//        if (stack1.empty()) {
//            System.out.println("Error");
//            return null;
//        }
//        return stack1.pop();
//    }
//
//    public static void main(String[] args) {
//        QueueUsingStacks testQueue = new QueueUsingStacks();
//        testQueue.enQueue(1);
//        testQueue.deQueue();