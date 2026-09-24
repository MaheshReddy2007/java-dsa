package queues;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        System.out.println("Node is created");
    }
}
public class QueuesUsingLinkedList
{
    static Node front,rare;
    //enqueue
    static void enqueue(int value)
    {
        Node newNode = new Node(value);
        if(front == null && rare == null)
        {
            front = rare = newNode;
            display();
            return;
        }
        rare.next = newNode;
        rare = newNode;
        display();
    }
    //dequeue
    static Node dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return front;
        }
        Node temp = front;
        front = front.next;
        display();
        if(front == null)
        {
            rare = null;
        }
        return temp;
    }
    static void display()
    {
        if(isEmpty())
        {
            System.out.println("queue is empty");
            return;
        }
        Node temp = front;
        while(temp!=null)
        {
            System.out.print(temp.data+"-");
            temp = temp.next;
        }
        System.out.println("end");
    }
    static boolean isEmpty()
    {
        return front == null;
    }
    static Node peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return null;
        }
        return front;
    }

    public static void main(String[] args)
    {
        enqueue(10);
//        enqueue(4);
       // System.out.println(dequeue().data);
        System.out.println(peek().data);
    }
}
