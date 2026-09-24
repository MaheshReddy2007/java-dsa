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
class T5ReversingList
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
  static Node reverseList()
  {
    if(head==null)
    {
      return head;
    }
    Node prevNode=null,nextNode,temp=head;
    while(temp!=null)
    {
      nextNode = temp.next;
      temp.next = prevNode;
      prevNode = temp;
      temp = nextNode;
    }
    head = prevNode;
    return head;
  }
  public static void main(String[] args) 
  {
    addElement(10);
    addElement(20);
    addElement(30);
    display(reverseList());
  }
}