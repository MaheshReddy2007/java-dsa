package hashmap;

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
class HashTable
{
    Node[] hashTable;
    int size;
    int count ;
    final double LOAD_FACTOR_THRESHOLD = 0.75;
    HashTable(int size)
    {
        this.size = size;
        hashTable = new Node[size];
        count = 0;
    }

    int hashFunction(int key)
    {
        return key%size;
    }

    double loadFactor()
    {
        return (double) count/size;
    }
     
    void add(int key)
    {
        if(loadFactor()>LOAD_FACTOR_THRESHOLD)
        {
            rehash();
        }
        int index = hashFunction(key);
        Node newNode = new Node(key);
        count++;
        // insert at head takes 0(1)
        newNode.next = hashTable[index];
        hashTable[index] = newNode;
    }
    boolean search(int key)
    {
        int index = hashFunction(key);
        Node temp = hashTable[index];
        while(temp!=null)
        {
            if(temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }
    void delete(int key)
    {
        int index = hashFunction(key);

        Node temp = hashTable[index];
        Node previousNode = null;

        while(temp != null && temp.data != key)
        {
            previousNode = temp;
            temp = temp.next;
        }

        // key not found
        if(temp == null)
            {
                return;
            }

        // deleting head node
        if(previousNode == null)
        {
            hashTable[index] = temp.next;
        }
        else
        {
            previousNode.next = temp.next;
        }
        count--;
    }
    void printTable()
    {
        for(int i=0;i<size;i++)
        {
            Node temp = hashTable[i];
            System.out.print(i+": [ ");
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println("null ]");
        }
    }

    void rehash()
    {
        count = 0;
        Node[] oldTable = hashTable;
        size = size*2;
        hashTable = new Node[size];

        for(int i=0;i<oldTable.length;i++)
        {
            Node temp = oldTable[i];
            while(temp!=null)
            {
                add(temp.data);
                temp = temp.next;
            }
        }
    }
}
public class OpenHashing 
{
    public static void main(String[] args)
    {
        HashTable table1 = new HashTable(10);
        table1.add(22);
        //System.out.println(h1.search(22));
        table1.add(2);
        table1.add(32);
        table1.add(52);
        table1.printTable();
        System.out.println(table1.search(22));
    }
}
