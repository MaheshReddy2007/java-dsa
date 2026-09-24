package hashmap;
import java.util.Arrays;
public class LinearProbing 
{
    int[] hashTable;
    int size;
    LinearProbing(int size)
    {
        this.size = size;
        hashTable = new int[size];
        Arrays.fill(hashTable,-1);
    }
    
    int hashFunction(int key)
    {
        return key%size;
    }

    void add(int key)
    {
        int index = hashFunction(key);
        for(int i=0;i<size;i++)
        {
            if(hashTable[(index+i)%size]==-1 || hashTable[(index+i)%size]==-2)
            {
                hashTable[(index+i)%size] = key;
                return;
            }
        }
    }

    boolean search(int key)
    {
        int index = hashFunction(key);
        int count = 0;
        while(hashTable[index]!=-1 && count<size)
        {
            if(hashTable[index]==key)
            {
                return true;
            }
            index = (index+1)%size;
            count++;
        }
        return false;
    }

    void display()
    {
        System.out.println(Arrays.toString(hashTable));
    }

    void delete(int key)
    {
        int index = hashFunction(key);
        for(int i=0;i<size;i++)
        {
            int current = (index+i)%size;
            if(hashTable[current]==-1)
            {
                break; //return;
            }
            if(hashTable[current]==key )
            {
                hashTable[current] = -2;
                return;
            }
        }
        System.out.println(key+" not found!");
    }
    public static void main(String[] args)
    {
        LinearProbing table1 = new LinearProbing(10);
        table1.add(10);
        table1.add(50);
        table1.add(49);
        table1.add(43);
        table1.add(56);
        table1.display();
        table1.delete(56);
        table1.delete(43);
        table1.display();
        System.out.println(table1.search(49));
    }
}
