package LinkedList;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        //System.out.println("Node is created"); slow down the execution 
    }
}
public class T2InsertAtPosition
{
    static Node head,tail;
    static void insertAtBeginning(int value)
    {
        Node newNode = new Node(value);
        if(head==null)
        {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    static void insertAtEnd(int value)
    {
        if(head==null)
        {
            insertAtBeginning(value);
            return;
        }
        Node newNode = new Node (value);
        tail.next = newNode;
        tail = newNode;
    }
    static int getSize() // take size variable to reduce time complexity
    {
      int count = 0;
      Node temp = head;
      while(temp!=null)
      {
        count++;
        temp = temp.next;
      }
      return count;
    }
    static void insertAtPosition(int pos,int value)
    {
      int size = getSize();
      if(pos<=0 || pos>size+1)
      {
        System.out.println("Invalid position!");
        return;
      }
      if(pos==1)
      {
        insertAtBeginning(value);
        return;
      }
      else if(pos==size+1)
      {
        insertAtEnd(value);
        return;
      }
      Node newNode = new Node(value);
      Node temp = head;
      //int countPosition = 0; no need
    for(int i = 1; i < pos - 1; i++)
    {
        temp = temp.next;
    }
      newNode.next = temp.next;
      temp.next = newNode;
    }
    static void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("end");
    }
    public static void main(String[] args)
    {
      insertAtEnd(1);
      display();
      insertAtEnd(2);
      display();
      insertAtEnd(3);
      display();
      insertAtEnd(4);
      display();
      System.out.println(getSize());
      insertAtPosition(3, 0);
      display();
    }
}
