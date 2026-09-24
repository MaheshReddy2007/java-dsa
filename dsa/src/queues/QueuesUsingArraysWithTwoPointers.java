package queues;
class QueuesDemo
{
    private int[] queue;
    private int rear,front,size;
    QueuesDemo(int size)
    {
        this.size = size;
        this.queue = new int[size];
        this.rear = -1;
        this.front = -1;
        System.out.println("Queue has been created with size "+size);
    }
    boolean isFull()
    {
        return rear == queue.length - 1;
    }
    boolean isEmpty()
    {
        return front==-1 || front>rear;

    }
    void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return;
        }
        for(int i=front;i<=rear;i++)
        {
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
    //enqueue
    void enqueue(int value)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
            return;
        }
        if(front==-1)
        {
            front++;
        }
        rear = rear + 1;
        queue[rear] = value;
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
            System.out.println("Deleted element is "+queue[front]);
            front=rear=-1;
            display();
            return;
        }
        System.out.println("Deleted element is "+queue[front]);
        front++;
        display();
    }
    //front
    int front()
    {
        if(isEmpty())
        {
            System.out.println("Queuee is empty");
            return -1;
        }
        return queue[front];
    }
}
public class QueuesUsingArraysWithTwoPointers
{
    public static void main(String[] args)
    {
        QueuesDemo queue = new QueuesDemo(5);
        queue.enqueue(1);
        queue.enqueue(1);
        queue.dequeue();
        //queue.dequeue();
        System.out.println("front :"+queue.front());
          //queue.display();
    }
}
