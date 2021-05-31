package Trees;

import java.util.Scanner;

import StacknQueues.QueueEmptyException;

public class TreeUse {
	private static TreeNode<Integer> takeInput(Scanner s) {
		int n;
		
		System.out.println("Enter Next Node");
		n=s.nextInt();//this is root ka data
		TreeNode<Integer> root=new TreeNode<Integer>(n);
		System.out.println("Enter Number of Children for" + n);
		int childCount=s.nextInt();
		for(int i=0;i<childCount;i++)
		{
			TreeNode<Integer> child = takeInput(s);
			root.children.add(child); 
					
		}
		
		return root;
	}
	public static void print(TreeNode<Integer> root)
	{
		String s=root.data+ " : ";
		for(int i=0;i<root.children.size();i++)
		{
			s=s+ root.children.get(i).data+ " , " ;
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++)
		{
			print(root.children.get(i));
			
		}
		
	}

	public static void prinLevelWise(TreeNode<Integer> root)//using queuee
	{
		if(root==null)
		{
			return;
		}
		QueueUsingLinkedList<TreeNode<Integer>> queue= new QueueUsingLinkedList<>();
		TreeNode<Integer> nullNode =new TreeNode<Integer>(0);
		queue.enqueue(root);
	}
	
	public static TreeNode<Integer> takeInputLevelWise() throws QueueEmptyException //using queue
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Root Data ");
		int rootData=s.nextInt();
		QueueUsingLinkedList<TreeNode<Integer>> pendingNodes=new QueueUsingLinkedList<>();
		TreeNode<Integer> root=new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty())
		{
			try 
			{
				TreeNode<Integer> frontNode=pendingNodes.dequeue();
				System.out.println("Enter Number of Children of  "+frontNode.data);
				int numChildren=s.nextInt();
				for(int i=0; i < numChildren;i++)
				{
					System.out.println("Enter " + (i+1) + "st child of the "+frontNode.data +" Node");
					int child=s.nextInt();
					TreeNode<Integer> childNode= new TreeNode<Integer>(child);
					frontNode.children.add(childNode);
					pendingNodes.enqueue(childNode);
				}
			} catch (QueueEmptyException e) 
			{
				//shooldn't come here 
				return null;
			} //dequeue can throw queue empty exception
		}
		return root;
	}
	
	public static int numNodes(TreeNode<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		int count =1;
		for(int i=0;i<root.children.size();i++)
		{
			count =count + numNodes(root.children.get(i));
		}
		return count;
	}
	
	public static int sumNodes(TreeNode<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		int sum =0;
		for(int i=0;i<root.children.size();i++)
		{
			sum =sum + sumNodes(root.children.get(i));
		}
		return sum+root.data;
		
	}
	public static int largest (TreeNode<Integer> root)
	{
		if (root==null)
		{
			return Integer.MIN_VALUE;
		}
		int ans=root.data;
		for (int i=0;i<root.children.size();i++)
		{
			int childLargest=largest(root.children.get(i));
			if(childLargest>ans)
			{
				ans=childLargest;
			}
		}
		return ans;
	}
	public static int numNodeGreater (TreeNode<Integer> root,int n) //number node with largest data 
	{
		if (root==null)
		{
			return Integer.MIN_VALUE;
		}
		int count=0;
		for (int i=0;i<root.children.size();i++)
		{
			count=count+numNodeGreater(root.children.get(i), n);
		}
		if(root.data>n)
		{
			return count+1;
		}
		else
			return count;
	}
	public static int getHeight(TreeNode<Integer> root){
		if(root==null)
		{
			return 0;
		}
		int height=0;
		for(int i=0;i<root.children.size();i++)
		{
			int childHeight=getHeight(root.children.get(i));
			if(childHeight>height)
			{
				height=childHeight;
			}
		}
		return height+1;
		
	}
	
	//print all nodes at depth k
	public static void printAtk(TreeNode<Integer> root , int k)
	{
		if(k<0)
		{
			return ;
		}
		if(k==0)
		{
			System.out.println(root.data);
			return;
		}
		for(int i=0;i<root.children.size();i++)
		{
			printAtk(root.children.get(i), k-1);
		}
	}
	public static int CountLeafNode(TreeNode<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		if(root.children.size()==0)
		{
			return 1;
		}
		int sum=0;
		for(int i=0;i<root.children.size();i++)
		{
			sum=sum+CountLeafNode(root.children.get(i));
		}
		return sum;
	}
	public static void preorder(TreeNode<Integer> root)
	{
		if(root==null)
			return;
		System.out.print(root.data);
		for(int i=0;i<root.children.size();i++)
		{
			preorder(root.children.get(i));
		}
	}
	public static void postorder(TreeNode<Integer> root)
	{
		if(root==null)
			return;
		
		for(int i=0;i<root.children.size();i++)
		{
			preorder(root.children.get(i));
		}
		System.out.print(root.data+" ");
	}
	public static void main(String[] args) throws QueueEmptyException {
		//Scanner s=new Scanner(System.in);
		//TreeNode<Integer> root =takeInput(s);
		//print(root);
		
		
		TreeNode<Integer> root=takeInputLevelWise();
		//print(root);
		//System.out.println(numNodes(root));
		//System.out.println(sumNodes(root));
		//System.out.println(numNodeGreater(root, 1));
		//printAtk(root, 2);
		//System.out.println(CountLeafNode(root));
		postorder(root);
		
				
		
		
		
		
		
		// TODO Auto-generated method stub
//		TreeNode<Integer> root= new TreeNode<Integer>(4);
//		TreeNode<Integer> node1= new TreeNode<Integer>(4);
//		TreeNode<Integer> node2= new TreeNode<Integer>(4);
//		TreeNode<Integer> node3= new TreeNode<Integer>(4);
//		TreeNode<Integer> node4= new TreeNode<Integer>(4);
//	
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		
//		node2.children.add(node4);
	
	}

	
	

}
