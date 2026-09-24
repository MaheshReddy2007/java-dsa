package queues;

class QueueDemo
{
    private int[] queue;
    //private int size;
    private int rare;
    QueueDemo(int size)
    {
        //this.size = size;
        this.queue = new int[size];
        rare = -1;
        System.out.println("Queue is created with size "+size);
    }
    boolean isFull()
    {
        return rare == queue.length-1;
    }

    void diaplay()
    {
        for(int i=0;i<=rare;i++)
        {
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
    //enque
    void enque(int value)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
            return;
        }
        rare = rare+1;
        queue[rare] = value;
        diaplay();
    }
    boolean isEmpty()
    {
        return rare == -1;
    }
    //dequeue
    void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(queue[0]+" is deleted");
        for(int i=1;i<=rare;i++)
        {
            queue[i-1] = queue[i];
            System.out.print(queue[i-1]+" ");
        }
        System.out.println();
        rare--;
        //diaplay();
    }
    //front
    int front()
    {
       if(isEmpty())
        {
            return-1;
        }
       else
       {
           return queue[0];
       }
    }
}
public class QueuesUsingArraysWithOnePointer
{
    public static void main(String[] args)
    {
        QueueDemo queue = new QueueDemo(5);
        queue.enque(10);
        queue.enque(30);
        queue.enque(0);
        queue.enque(3);
        queue.enque(330);
        System.out.println(queue.front());
        //queue.enque(30);
        queue.dequeue();
        System.out.println("\n"+queue.front());
    }
}
