package Trees;

import java.util.ArrayList;
import java.util.Scanner;

import StacknQueues.QueueEmptyException;

public class BinaryTreeUse {

	
	public static BinaryTreeNode<Integer> takeInput(Scanner s) {
		int rootData;
		System.out.println("Enter Root Data");
		rootData=s.nextInt();
		if(rootData==-1)
		{
			return null;
		}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		root.left=takeInput(s);
		root.right=takeInput(s);
		return root;
	}
	public static void printTree(BinaryTreeNode<Integer> root)
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
	public static BinaryTreeNode<Integer> takeInputLevelWise() 
	{
		Scanner s=new Scanner(System.in);
		QueueUsingLinkedList<BinaryTreeNode<Integer>> pendingNodes=new QueueUsingLinkedList<>();
		System.out.println("Enter Root Data");
		int rootData=s.nextInt();
		if(rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root =new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		try {
			while(!pendingNodes.isEmpty())
			{
				BinaryTreeNode<Integer> front;
				  try 
				  {
					front=pendingNodes.dequeue();
				  } 
				  catch (QueueEmptyException e) 
				  {
					// TODO Auto-generated catch block
					return null;
				  }
				  
				  
				  System.out.println("Enter left Child of "+ front.data );
				  int leftChild=s.nextInt();
				  if(leftChild!=-1)
				  {
					  BinaryTreeNode<Integer> child  =new BinaryTreeNode<Integer>(leftChild);
					  pendingNodes.enqueue(child);
					  front.left=child;
				  }
				  
				  System.out.println("Enter right Child of "+ front.data );
				  int rightChild=s.nextInt();
				  if(rightChild!=-1)
				  {
					  BinaryTreeNode<Integer> child  =new BinaryTreeNode<Integer>(rightChild);
					  pendingNodes.enqueue(child);
					  front.right=child;
				  }
				  
			}
			return root;
		} catch (QueueEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return root;
	}
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) throws QueueEmptyException
	{
		if(root==null)
		{
			return;
		}
		QueueUsingLinkedList<BinaryTreeNode<Integer>> queue= new QueueUsingLinkedList<>();
		queue.enqueue(root);
	
			while(!queue.isEmpty())
			{
				try {
					BinaryTreeNode<Integer> front=queue.dequeue();
					if(front==null)
					{
						System.out.println();
						if(!queue.isEmpty())
						{
							queue.enqueue(null);
						}
					}
					else
					{
					System.out.print(front.data+":L:");
					if(front.left != null)
					{
						queue.enqueue(front.left);
						System.out.print(front.left.data+ ",R:" );
					}
					else
					{
						System.out.print(-1 + ",R:");
					}
					if(front.right != null)
					{
						queue.enqueue(front.right);
						System.out.println(front.right.data);
					}
					else
					{
						System.out.println(-1);
					}
					}
				}
				catch (QueueEmptyException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
			}
		
	}
	 public static int countNodes(BinaryTreeNode<Integer> root)
	 {
		 if(root==null)
		 {
			 return 0;
		 }
		 int ans=1;
		 ans=ans+countNodes(root.left);
		 ans=ans+countNodes(root.right);
		 return ans;
	 }
	 
	 public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
		    if(root==null)
		    	return false;
		    if(root.data.equals(x))
		    {
		    	return true;
		    }
		    return ( isNodePresent(root.left, x) || isNodePresent(root.right, x)); 
		}
	 public static int getHeight(BinaryTreeNode<Integer> root)
	 {
		 if(root==null)
		 {
			 return 0;
		 }
		 int height=1; // for root
		 height=height+getHeight(root.left);
		 height=height+getHeight(root.right);
		 return height;
		 
	 }
 public static void MirrorTree(BinaryTreeNode<Integer> root)
 {
	 if(root==null)
	 {
		 return;
	 }
	 MirrorTree(root.left);
	 MirrorTree(root.right);
	 BinaryTreeNode<Integer> temp=root.left;
	 root.left=root.right;
	 root.right=temp;
	 return; 
	 
 }
 public static int getMaxDiameter(BinaryTreeNode<Integer> root)
 {
	 if(root==null)
	 {
		 return 0;
	 }
	 int option1 = getHeight2(root.left)+getHeight2(root.right);
	 int option2 = getMaxDiameter(root.left); // har node par hum height nikal rahe hai constant kaam nahi kar rhae 
	 int option3 = getMaxDiameter(root.right);
	 //T(N)=Kn + 2T(n/2) == O(nlogn) // when equal size ree comes 
	 //T(n) =	kn + T(n-1) agar sirf ek hi side ho tree O(n2) 
	 return Math.max(option1, Math.max(option2, option3));
 }
	
	public static int getHeight2(BinaryTreeNode<Integer> root) {
	if(root==null)
	{
		return 0;
	}
	int leftheight=getHeight2(root.left);
	int rightHeight=getHeight2(root.right);
	return 1+Math.max(leftheight, rightHeight);
	
	//Time Complexity
	//O(n)
	//T(n)=2T(n/2) +k 2 half size ki problem +some constant k 
}
	
	
	public static Pair<Integer,Integer> getDiameterHeight(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			Pair<Integer,Integer> output=new Pair<>();
			output.diameter=0;
			output.height=0;
			return output;
		}
		Pair<Integer, Integer> leftOutput = getDiameterHeight(root.left); //rightoutput contains left ki height and diameter
		Pair<Integer, Integer> rightOutput = getDiameterHeight(root.right); //rightoutput contains left ki height and diameter
		//overall height
		int height=1+Math.max(leftOutput.height, rightOutput.height);
		int option1=leftOutput.height+rightOutput.height;
		int option2=leftOutput.diameter;
		int option3=rightOutput.diameter;
		int diameter=Math.max(option1, Math.max(option2, option3));
		 //har node par constant work ho rah h at each of node 
		// time complexity O()
		Pair<Integer,Integer> output=new Pair<>();
		
		output.height=height;
		output.diameter=diameter;
		
		return output;
		
	}
	public static void InOrder(BinaryTreeNode<Integer> root)
	{
		if(root==null)
			return;
		InOrder(root.left);
		System.out.print(root.data+" ");
		InOrder(root.right);
	}
	public static void preOrder(BinaryTreeNode<Integer> root)
	{
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public static void Postorder(BinaryTreeNode<Integer> root )
	{
		if(root==null)
			return;
		preOrder(root.left);
		preOrder(root.right);
		System.out.print(root.data+" ");
		
	}
	
	//2 array di hongi inorder and pre order , plan is to build a tree from them
	public static BinaryTreeNode<Integer> BuildTree(int inorder[],int preorder[])// PreOrder aur InORder 
	{
		return BuildTreeHelper(inorder,preorder,0 ,inorder.length -1 , 0 , preorder.length - 1) ;
		//inorder array , pre order array , inorder ka start , inorder ki length , preorder ka start , preorder ki length
	}
	public static BinaryTreeNode<Integer> BuildTreeHelper(int[] inorder, int[] preorder, int inStart, int inEnd, int preStart, int preEnd) 
	{
		if(inStart>inEnd)
		{
			return null;
		}
		int rootData=preorder[preStart];
		BinaryTreeNode<Integer> root =new BinaryTreeNode<Integer>(rootData);
		
		//finding root data index in inorder 
		int rootInorderIndex=-1;
		for(int i=inStart;i<=inEnd;i++)
		{
			if(inorder[i] == rootData)
			{
				rootInorderIndex=i;
				break;
			}
		}
		if(rootInorderIndex==-1)//elment hai hi nhai bahut rare case me 
		{
			return null;
		}
		 int leftInorderStart = inStart;
		 int leftInorderEnd=rootInorderIndex - 1;
		 int leftpreorderStart=preStart + 1;
		 int leftpreorderEnd = leftInorderEnd - leftInorderStart + leftpreorderStart ;
		 
		 int rightInorderStart = rootInorderIndex + 1;
		 int rightInorderEnd=inEnd;
		 int rightpreorderStart = leftpreorderEnd + 1 ;
		 int rightpreorderEnd = preEnd;
		 
		 root.left=BuildTreeHelper(inorder, preorder, leftInorderStart, leftInorderEnd, leftpreorderStart, leftpreorderEnd);
		 root.right=BuildTreeHelper(inorder, preorder, rightInorderStart, rightInorderEnd, rightpreorderStart, rightpreorderEnd);
		return root;
	}
	
	public static BinaryTreeNode<Integer> buildTreepostandinorder(int[] postOrder, int[] inOrder) 
	{
		return buildTreepostandinorderHelper(postOrder,inOrder , 0 , inOrder.length-1 , 0 , postOrder.length-1); 
	}
	
	private static BinaryTreeNode<Integer> buildTreepostandinorderHelper(int[] postOrder, int[] inOrder, int inOrderStart , int inOrderEnd , int postOrderStart , int postOrderEnd) 
	{
		if(inOrderStart> inOrderEnd)
		{
			return null;
		}
		int rootdata=postOrder[postOrderEnd];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata);
		
		//finding root data index in inorder 
		int rootInorderIndex=-1;
		for(int i=inOrderStart;i<=inOrderEnd;i++)
		{
			if(inOrder[i]==rootdata)
			{
				rootInorderIndex=i;
				break;
			}
		}
		if(rootInorderIndex==-1)//elment hai hi nhai bahut rare case me 
		{
			return null;
		}
		 int leftInorderStart = inOrderStart ;
		 int leftInorderEnd= rootInorderIndex - 1 ;
		 int leftpostorderStart= postOrderStart;
		 int leftpostorderEnd =  postOrderStart + rootInorderIndex  - leftInorderStart -1 ;
		 
		 int rightInorderStart = rootInorderIndex + 1;
		 int rightInorderEnd= inOrderEnd;
		 int rightpostorderStart = postOrderStart + rootInorderIndex - inOrderStart;
		 int rightpostorderEnd =  postOrderEnd -1;
         root.left=buildTreepostandinorderHelper(postOrder, inOrder, leftInorderStart, leftInorderEnd, leftpostorderStart, leftpostorderEnd);
         root.right=buildTreepostandinorderHelper(postOrder, inOrder, rightInorderStart, rightInorderEnd, rightpostorderStart, rightpostorderEnd);
         return root;
	}
	// Binary Search
	public static ArrayList<Integer> getRoottoNodePathBinaryTree(BinaryTreeNode<Integer> root , int data )
	{
		if(root==null)
		{
			return null;
		}
		if(data==root.data)
		{
			ArrayList<Integer> output=new ArrayList<>();
			output.add(root.data);
			return output;
		}
		ArrayList<Integer> leftOutput=getRoottoNodePathBinaryTree(root.left, data);
		if(leftOutput!=null)
		{
			leftOutput.add(root.data);
			return leftOutput;
		}
		ArrayList<Integer> 		rightOutput=getRoottoNodePathBinaryTree(root.right, data);
		if(rightOutput!=null)
		{
			rightOutput.add(root.data);
			return rightOutput;
		}
		else
		{
			return null;
		}
	}
	 //Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	//Binary Search Tree
	public static boolean searchBST(BinaryTreeNode<Integer> root , int data)
	{
		 if(root==null)
		 {
			 return false;
		 }
		 if(root.data==data)
		 {
			 return true;
		 }
		 if(data<root.data)
		 {
			 return searchBST(root.left, data);
		 }
		 return searchBST(root.right, data);
	}
	public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2) //printing elements in range k1 & k2 
	{
		if(root==null)
			return;
		if(root.data<k1) // only right me jayega
		{
			 elementsInRangeK1K2(root.right, k1, k2);
		}
		else if(root.data>k2) //left me h jayega
		{
			elementsInRangeK1K2(root.left, k1, k2);
		}
		else   //k1<<root.data<k2
		{
			System.out.print(root.data+" ");
			elementsInRangeK1K2(root.right, k1, k2);
			elementsInRangeK1K2(root.left, k1, k2);
		}
	}
	public static boolean CheckIfBST(BinaryTreeNode<Integer> root) 
	{
		if(root==null)
			return true;
		int leftMax= maximum(root.left);
		int rightMin=minimum(root.right); //T(n)=T(n/2) +kn ==O(nlogn)
		//same daimeter wali problem 
		//ek hi function me maximum minimum aur isBST return karenge 
		if(root.data<=leftMax && root.data>=rightMin)//constant recursive calls 
		{
			return false;
		}
		boolean isLeftBST=CheckIfBST(root.left); //constant recursive calls
		boolean isRightBST=CheckIfBST(root.right); //constant recursive calls
		if(isLeftBST && isRightBST) //constant
		{
			return true;
		}
		else
			return false;//iski time complexity zyada hai so apn ek aur class banayenge jisme maximum minimum aur isbst teeno return karenge 
	}
	public static int maximum(BinaryTreeNode<Integer> root) {
		if(root==null)
		{
			return Integer.MIN_VALUE;
		}
		return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
	}
	public static int minimum(BinaryTreeNode<Integer> root) {
		if(root==null)
		{
			return Integer.MAX_VALUE;
		}
		return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
	}
	
	public static Pair2<Boolean,Pair2<Integer, Integer>> isBST(BinaryTreeNode<Integer> root) 
	{
		if(root==null) // BST toh hai 
		{
			Pair2<Boolean, Pair2<Integer, Integer>> output = new Pair2<Boolean,Pair2<Integer, Integer>>();
			output.first=true;  //boolean 
			output.second=new Pair2<Integer, Integer>();
			output.second.first=Integer.MAX_VALUE; //minimum 
			output.second.second=Integer.MIN_VALUE; //maximum 
			return output;
		}
		Pair2<Boolean, Pair2<Integer, Integer>> leftOutput=isBST(root.left);
		Pair2<Boolean, Pair2<Integer, Integer>> rightOutput=isBST(root.right);
		
		int min = Math.min(root.data, Math.min(leftOutput.second.first, rightOutput.second.first)); //gives overall min
		int max = Math.max(root.data, Math.max(leftOutput.second.second, rightOutput.second.second)); //gives overall max
		boolean isBST2=(root.data>leftOutput.second.second) && (root.data<=rightOutput.second.first) && leftOutput.first && rightOutput.first;
		Pair2<Boolean, Pair2<Integer, Integer>> output = new Pair2<Boolean,Pair2<Integer, Integer>>();
		output.first=isBST2;  //boolean 
		output.second=new Pair2<Integer, Integer>();
		output.second.first=min; //minimum 
		output.second.second=max; //maximum 
		return output;
	}
	
	public static boolean isBST3(BinaryTreeNode<Integer> root , int min , int max)
	{
		if(root==null)
		{
			return true;
		}
		if(root.data< min || root.data> max)
		{
			return false;
		}
		boolean isLeftOk=isBST3(root.left, min, root.data-1);
		boolean isRightOk=isBST3(root.right, root.data, max);
		return isLeftOk&&isRightOk;		
	}
	
	public static BinaryTreeNode<Integer> SortedArraytoBST(int arr[])
	{
		return SortedArraytoBSThelper(arr, 0 , arr.length-1);
	}
	public static BinaryTreeNode<Integer> SortedArraytoBSThelper(int[] arr, int startIndex, int endIndex) 
	{
		if(startIndex>endIndex)
		{
			return null;
		}
		int mid = startIndex+(endIndex-startIndex)/2;
		BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(arr[mid]);
		root.left=SortedArraytoBSThelper(arr, startIndex, mid-1);
		root.right=SortedArraytoBSThelper(arr, mid+1, endIndex);
		return root;
	}
	public static LinkedListNode<Integer> construstLLusingBST(BinaryTreeNode<Integer> root)
	{
		return constructLLusingBSThelper(root).head;
	}
	public static PairInLL constructLLusingBSThelper(BinaryTreeNode<Integer> root) {
		if(root==null)
		{
			PairInLL pair =new PairInLL();
			return pair;
		}
		LinkedListNode<Integer> newNode= new LinkedListNode<>(root.data);
		PairInLL leftList=constructLLusingBSThelper(root.left);
		PairInLL rightList= constructLLusingBSThelper(root.right);
		PairInLL pair =new PairInLL();
		//checking leftlist ka tail null to nahi h
		// agar null hai  toh pair start new node se karenge 
		if(leftList.tail!=null)
		{
			leftList.tail.next=newNode;
		}
		newNode.next=rightList.head;
		if(leftList.head!=null)
		{
			pair.head=leftList.head;
		}
		else
			pair.head=newNode;
		if(rightList.tail!=null)
		{
			pair.tail=rightList.tail;
			
		}
		else
			pair.tail=newNode;
		return pair;
	
	}
	public static ArrayList<Integer> getRoottoNodePath(BinaryTreeNode<Integer> root , int data )
	{
		if(root==null)
		{
			return null;
		}
		if(data==root.data)
		{
			ArrayList<Integer> output=new ArrayList<>();
			output.add(root.data);
			return output;
		}
		else if( data< root.data)
		{
			ArrayList<Integer> leftOutput=getRoottoNodePath(root.left, data);
			if(leftOutput!=null)//matlab left me mil gya element
			{
				leftOutput.add(root.data);
			}
			return leftOutput;
		}
		else
		{
			ArrayList<Integer>rightOutput=getRoottoNodePath(root.right, data);
			if(rightOutput!=null)//matlab left me mil gya element
			{
				rightOutput.add(root.data);
			}
			return rightOutput; 
		}
	}
	
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
//		BinaryTreeNode<Integer> node1 = new BinaryTreeNode<Integer>(2);
//		root.left=node1;
//		BinaryTreeNode<Integer> node2 = new BinaryTreeNode<Integer>(2);
//		root.right=node2;
		//Scanner s=new Scanner(System.in);
		//BinaryTreeNode<Integer> root = takeInput(s);
		//BinaryTreeNode<Integer> root = takeInputLevelWise();
		//printLevelWise(root);
		//System.out.println("Height : "+getDiameterHeight(root).height);
		//System.out.println("Diameter : "+getDiameterHeight(root).diameter);
		int postOrder[]= {4,5,2,6,7,3,1};
		int inOrder[]= {4,2,5,1,6,3,7};
		int preorder[]= {1,2,4,5,3,6,7};
		BinaryTreeNode<Integer> root = buildTreepostandinorder(postOrder,inOrder);
		printTree(root);
		BinaryTreeNode<Integer> root1 =BuildTree(inOrder, preorder);
		//printTree(root1);
		
	}
}
