package Trees;

import java.util.ArrayList;
//Array and Linked List - Which changes how data is stored in memory 
//Stack and Queue- LEvel above a basic data structure which defines how data is accessible to the user .


//Tree - Data structure There is a root node .Each node can have address of multiple nodes.
//Root Node- Children Node relationship
//Leaf Node- Individual Node -A node with no Child 
public class TreeNode <T> {
	public T data;
	public ArrayList<TreeNode<T>> children; //treenode type ke hi ho sakte hai children
	
	public TreeNode(T data)
	{
		this.data=data;
		children=new ArrayList<>();
	}

}
