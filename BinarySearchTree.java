import java.io.*;
class Bst
{
	int data;
	Bst left,right;
	int insert(Bst b,int key)
	{
		if(b.data==0)
		{
			b.data=key;
			b.left=new Bst();
			b.right=new Bst();
			return 1;
		}
		else if(b.data>key)
		{
			return insert(b.left,key);
		}
		else if(b.data<key)
		{
			return insert(b.right,key);
		}
		return 0;
	}
	int inorder_traversal(Bst b)
	{
		if(b.data!=0)
		{
		inorder_traversal(b.left);
		System.out.print(b.data+" ");
		inorder_traversal(b.right);
		return 1;
		}
		return 0;
	}
	int preorder_traversal(Bst b)
	{
		if(b.data!=0)
		{
		System.out.print(b.data+" ");
		preorder_traversal(b.left);
		preorder_traversal(b.right);
		return 1;
		}
		return 0;
	}
	int postorder_traversal(Bst b)
	{
		if(b.data!=0)
		{
		postorder_traversal(b.left);
		postorder_traversal(b.right);
		System.out.print(b.data+" ");
		return 1;
		}
		return 0;
	}
}
class BinarySearchTree
{
	public static void main(String[] args)
	{
		Bst b=new Bst();
		b.insert(b,5);
		b.insert(b,3);
		b.insert(b,4);
		b.insert(b,2);
		b.insert(b,1);
		b.inorder_traversal(b);
		System.out.print("\n");
		b.preorder_traversal(b);
		System.out.print("\n");
		b.postorder_traversal(b);
	}
}