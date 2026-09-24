package LinkedList;
class Node
{
  int data;
  Node next;
  Node(int data)
  {
    this.data = data;
    this.next = null;
  }
}
class T4FindElement
{
  static Node head,tail;
  static Node addElement(int value)
  {
    Node newNode = new Node(value);
    if(head==null)
    {
      head = newNode;
      tail = newNode;
      return head;
    }
    tail.next = newNode;
    tail = newNode;
    return head;
  }
  static void display(Node temp)
  {
    if(temp==null)
    {
      System.out.println("No elements to display!");
      return;
    }
    while(temp!=null)
    {
      System.out.print(temp.data+"->");
      temp = temp.next;
    }
    System.out.println("null");
  }
  static boolean searchElement(int element)
  {
    Node temp = head;
    while(temp!=null)
    {
      if(temp.data==element)
      {
        return true;
      }
      temp = temp.next;
    }
    return false;
  }
  public static void main(String[] args) 
  {
      display(addElement(10));
      display(addElement(0));
      display(addElement(1));
      if(searchElement(10))
      {
        System.out.println("Found!");
      }
      else
      {
        System.out.println("Not Found!");
      }
  }
}