package queues;
class CircularQueueDemo
{
    private int[] queue;
    private int front,rear;//n;
    CircularQueueDemo(int size)
    {
       // this.n = size;
        this.queue = new int[size];
        this.front = -1;
        this.rear = -1;
        System.out.println("queue is created with size "+size);
    }
    boolean isFull()
    {
        return (rear+1)%queue.length == front;
    }
    boolean isEmpty()
    {
        return front==-1;
    }
    void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        while (i != rear)
        {
            System.out.print(queue[i]+" ");
            i = (i+1)%queue.length;
        }
        System.out.println(queue[i]);
    }
    //enqueue
    void enqueue(int value)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
            return;
        }
        if(front == -1 && rear == -1)
        {
            front++;
            rear++;
            queue[rear] = value;
            System.out.println("Element inserted "+value);
            display();
            return;
        }
        rear = (rear+1)%queue.length;
        queue[rear] = value;
        System.out.println("Element inserted "+value);
        display();
    }
    //dequeue
    void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return;
        }
        if(front==rear)
        {
            System.out.println(queue[front]+" is Element deleted");
            front=-1;rear=-1;
            display();
            return;
        }
        System.out.println(queue[front]+" is Element deleted");
        front = (front+1)%queue.length;
        display();
    }
    //front (peak)
    int front()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }
}
public class CircularQueue
{
    public static void main(String[] args)
    {
        CircularQueueDemo queue = new CircularQueueDemo(5);
        queue.enqueue(4);
        queue.enqueue(4);
        queue.enqueue(4);
        queue.enqueue(4);
        queue.enqueue(9);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
       // queue.dequeue();
        System.out.println("Front Elemetn is : "+queue.front());
    }
}
