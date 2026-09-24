package arrays;

class DynamicReSize
{
    int[] array;
    int top, capacity;
    
    DynamicReSize(int size)
    {
        capacity = size;
        array = new int[capacity];
        top = 0;
    }

    // add element
    void add(int value)
    {
        if(top == capacity)
        {
            resize();
        }

        array[top] = value;
        top++;
        display();
    }

    // resize array
    void resize()
    {
        capacity = capacity * 2;
        int[] dynamicArray = new int[capacity];

        for(int i = 0; i < top; i++)
        {
            dynamicArray[i] = array[i];
        }

        array = dynamicArray;
    }

    // display elements
    void display()
    {
        if(top == 0)
        {
            System.out.println("array is empty");
            return;
        }

        for(int i = 0; i < top; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

public class DynamicReSizeing
{
    public static void main(String[] args)
    {
        DynamicReSize obj = new DynamicReSize(2);
        obj.add(1);
        obj.add(2);
        obj.add(3); // triggers resize
    }
}
