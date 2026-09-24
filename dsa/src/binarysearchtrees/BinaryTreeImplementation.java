package binarysearchtrees;
public class BinaryTreeImplementation {
  static Node root;
  static Node insert(Node root,int val)
  {
    if(root == null)
    {
      root = new Node(val);
      return root;
    }
    else if(val>root.val)
    {
      root.right = insert(root.right,val);
    }
    else{
      root.left = insert(root.left,val);
    }
    return root;
  }
  static void inOrder(Node root)
  {
    if(root == null)
    {
      return;
    }
    inOrder(root.left);
    System.out.print(root.val+" ");
    inOrder(root.right);
  }
  public static void main(String[] args) {
      root = insert(root, 1);
      inOrder(root);
  }
}
