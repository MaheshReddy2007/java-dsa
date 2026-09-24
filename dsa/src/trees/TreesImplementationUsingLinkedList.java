package trees;
import java.util.Scanner;
class Node 
{
    Node left;
    int data;
    Node right;
    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class TreesImplementationUsingLinkedList 
{
    static Node addTree(Scanner sc)
    {
        System.out.println("Enter the data (Enter -1 for no node):");
        int data = sc.nextInt();
        if(data == -1)
        {
            return null;
        }
        Node root = new Node(data);
        System.out.println("Enter left child "+data+":");
        root.left = addTree(sc);
        System.out.println("Enter right child "+data+":");
        root.right = addTree(sc);
        return root;
    }
    static void displayTree(Node root,int level)
    {
        if(root == null)
        {
            return;
        }
        displayTree(root.right,level+1);
        for(int i=0;i<level;i++)
        {
            System.out.print("    ");
        }
        System.out.println(root.data);
        displayTree(root.left, level+1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Node root1 = addTree(sc);
        System.out.println("Displaying The Tree:");
        displayTree(root1, 0);
    }
}
