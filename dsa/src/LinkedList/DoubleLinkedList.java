package LinkedList;
class Node
{
    Node prevNode;
    int data;
    Node next;
    Node(int value)
    {
        data = value;
        prevNode = null;
        next = null;
        System.out.println("New Node is created");
    }
}
public class DoubleLinkedList
{
    static Node head;
    static Node tail;
    static int size = 0;
    static void insertAtBeginning(int value)
    {
        Node newNode = new Node(value);
        size++;
        if(head==null)
        {
            head = newNode;
            tail = newNode;
            display();
            return;
        }
        newNode.next = head;
        head.prevNode = newNode;
        head = newNode;
        display();
    }
    //insertAtEnd
    static void insertAtEnd(int value)
    {
        if(head==null)
        {
            insertAtBeginning(value);
            return;
        }
        Node newNode = new Node(value);
        //if tail is there
        tail.next = newNode;
        newNode.prevNode = tail;
        size++;
        tail = newNode;
        display();
//        if there is no tail
//        Node temp = head;
//        while(temp.next!=null)
//        {
//            temp = temp.next;
//        }
//        temp.next = newNode;
//        newNode.prevNode = temp;
//        size++;
//        display();
    }
    //insertAtSpecificPosition
    static void insertAtSpecificPosition(int value,int position)
    {
        if(position<=0 || position>size+1)
        {
            System.out.println("invalid position!");
            display();
            return;
        }
        else if(position==1)
        {
            insertAtBeginning(value);
            return;
        }

        else if(position==size+1)
        {
            insertAtEnd(value);
            return;
        }
        Node newNode = new Node(value);
        Node temp = head;
        int count = 1;
        while (temp!=null && count<position)
        {
            temp = temp.next;
            count++;
        }
        newNode.prevNode = temp.prevNode;
        temp.prevNode.next = newNode;
        newNode.next = temp;
        temp.prevNode = newNode;
        size++;
        display();
    }
    static void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    //aftervalue
    static void insertAfterValue(int target,int value)  //item is value/data
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null && temp.data!=target)
        {
            temp = temp.next;
        }
        if(temp==null)
        {
            System.out.println(target+" not found!");
            return;
        }
        else if(temp.next==null)
        {
            insertAtEnd(value);
            return;
        }
        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next.prevNode = newNode;
        newNode.prevNode = temp;
        temp.next = newNode;
        size++;
        display();
    }
    public static void main(String[] args)
    {
//        insertAtBeginning(5);
//        insertAtBeginning(4);
        insertAtEnd(5);
        insertAtEnd(6);
        insertAtEnd(8);
       // insertAtSpecificPosition(9,2);
        insertAfterValue(8,9);
    }
}
