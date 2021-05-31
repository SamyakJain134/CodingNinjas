package Trees;

import java.lang.reflect.Array;
import java.util.ArrayList;

import LinkedList.printIthNode;

public class BinarySearchTree {
	private BinaryTreeNode<Integer> root;
	public boolean hasData(int data)
	{
		return (hasDatahelper(data, root));
	}
	private boolean hasDatahelper(int data , BinaryTreeNode<Integer> root)
	
	{
		if(this.root==null) // simple root will access root local variable 
		{
			return false;
		}
		if(root.data==data)
		{
			return true;
		}
		else if	(data >  root.data)
		{
			return hasDatahelper(data, root.right);
		}
		else {
			return hasDatahelper(data, root.left);//call left
		}
	}
	
	public void insertData(int data)
	{
		root= (insertDataHelper(data, root));
	}
	private	 BinaryTreeNode<Integer> insertDataHelper(int data, BinaryTreeNode<Integer> root) 
	{
		if(root==null)
		{
			BinaryTreeNode<Integer> newNode=new BinaryTreeNode<Integer>(data);
			return newNode;
		}
		if(root.data<data)
		{
			//right
			BinaryTreeNode<Integer> rightrootNode=insertDataHelper(data, root.right);
			root.right=rightrootNode;
			return root;
		}
		else //(root.data>=data)
		{
			//left 
			BinaryTreeNode<Integer> leftrootNode=insertDataHelper(data, root.left);
			root.left=leftrootNode;
			//root.left=insertDataHelper(data, root.left); // aise bhi kar sakte hai 
			return root;
		}
		
	}
	public void deleteData(int data)
	{
		 root= deleteDataHelper(data,root);
	}
	private BinaryTreeNode<Integer> deleteDataHelper(int data, BinaryTreeNode<Integer> root) {

		if(root==null)
		{
			return null;
		}
		if(root.data<data)
		{

			root.right=deleteDataHelper(data, root.right);
			return root; 
		}
		if(root.data>data)
		{
			root.left=deleteDataHelper(data, root.left);
			return root;
		}
		else    //(root.data==data)
		{
			if(root.right==null && root.left==null)
			{
				return null; //because dono side kuch nahi hai sirf ek node hai wahi delete karni hiai
			}
			else if(root.right==null)
			{	
				return root.left;
			}
			else if(root.left==null)
			{
				return root.right;
			}
			else  //root ke dono side me elements rakhe hai 
			{
				//right side ka minimum hoga root node yaha 
				//ya fir left side ka maximum
				int minimum;
				BinaryTreeNode<Integer> minNode=root.right;
				while(minNode.left!=null)
				{
					minNode=minNode.left;
				}
				root.data=minNode.data;
				root.right=deleteDataHelper(minNode.data, root.right); //because aar null ayaa to null attack karna hoga 
				//return maximumfromleft(root.left);
				return root; 
			}
		} 
	}
	public void printTree()
	{
		printTree(root);
	}
	private void printTree(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		String tobePrinted=root.data+ " : ";
		if(root.left!=null)
		{
			tobePrinted +="L: "+ root.left.data + ";";
		}
		if(root.right!=null)
		{
			tobePrinted += "R: "+root.right.data ;
		}
		System.out.println(tobePrinted);
		printTree(root.left);
		printTree(root.right);
	}
	public static void main(String args[])
	{
		BinarySearchTree bst= new BinarySearchTree();
		bst.insertData(10);
		bst.insertData(20);
		bst.insertData(5);
		bst.insertData(15);
		bst.insertData(3);
		bst.insertData(7);
		bst.printTree();
		bst.deleteData(10);
		bst.printTree();
		
	}
}
// Balanced Tree
//Height of right sub tree - Height of left	 sub tree <=1//
//AVL Trees 
//kED BLACK TREES
//2-4TREE