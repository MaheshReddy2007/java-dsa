package Stacks;

class Stack
{
    int size;
    int top;
    int[] arr;

    Stack(int size)
    {
        this.size = size;
        this.top = -1;
        this.arr = new int[size];
    }

    void resize()
    {
        int oldSize = arr.length;
        int[] newArr = new int[oldSize * 2];

        for(int i = 0; i < oldSize; i++)
        {
            newArr[i] = arr[i];
        }

        arr = newArr;
        size = newArr.length;
    }

    void add(int val)
    {
        if(top == size - 1)
        {
            resize();
        }

        top++;
        arr[top] = val;
    }

    void pop()
    {
        if(top == -1)
        {
            System.out.println("Underflow: Stack is empty");
            return;
        }

        top--;
    }

    int peek()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty");
            return -1;
        }

        return arr[top];
    }

    boolean isEmpty()
    {
        return top == -1;
    }
}
public class StackImpUsingArrays {
  public static void main(String[] args) {
       Stack stack = new Stack(3);
        stack.add(10);
        stack.add(20);
        stack.add(30);
        System.out.println("Top: " + stack.peek());
        // Stack is full, so resize() will happen
        stack.add(40);
        System.out.println("Top after adding 40: " + stack.peek());
        stack.pop();
        System.out.println("Top after pop: " + stack.peek());
        System.out.println("Is stack empty? " + stack.isEmpty());
  }
}
