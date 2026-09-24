package Stacks;
import java.util.Stack;
public class StacksPratice 
{
  public static void main(String[] args)
  {
    // generic 0r modern method
    Stack<Integer> stack = new Stack<>();
    System.out.println(stack.isEmpty());
    //stack.pop();
    // push method
    stack.push(10);
    stack.push(2);
    stack.push(28);
    stack.push(38);
    System.out.println(stack);
    // pop method
    //stack.pop();
    //System.out.println(stack);
    //System.out.println(stack.pop());
    //System.out.println(stack.pop());

    // peek method
    //int result = stack.peek();
    //System.out.println(result);
    //stack.pop();
    System.out.println(stack.peek());
    System.out.println(stack.isEmpty());

    //search method
    System.out.println(stack.search(10));



    // pre-generic model or old formate creation
    Stack obj2 = new Stack();
    obj2.add(10);
    obj2.add(30);
    System.out.println(obj2);
  }
}
