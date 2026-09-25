package queues;

import java.util.Stack;

public class QueueUsingStacks {

    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    // Enqueue
    static void enqueue(int value) {
        stack1.push(value);
    }

    // Dequeue
    static int dequeue() {

        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    // Peek
    static int peek() {

        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    // Check whether queue is empty
    static boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);

        System.out.println("Dequeued: " + dequeue());
        System.out.println("Front: " + peek());

        enqueue(50);

        System.out.println("Dequeued: " + dequeue());
        System.out.println("Dequeued: " + dequeue());
    }
}