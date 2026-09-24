package warmupproblems;

public class RecursionDemo 
{
    static int factroial(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n*factroial(n-1); 
    }
    // static void display2(int n)
    // {
    //     System.out.println(n);
    //     display3(3);
    // }
    // static void display3(int n)
    // {
    //     System.out.println(n);
    // }
    public static void main(String[] args)
    {
        System.out.println(factroial(5));
    }
}
