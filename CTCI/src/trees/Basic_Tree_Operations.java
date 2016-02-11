package trees;

import java.util.ArrayList;
import java.util.Stack;

public class Basic_Tree_Operations {

	Node root;

	public static void main(String []args){
		Basic_Tree_Operations tree_Operations = new Basic_Tree_Operations();

		tree_Operations.addElementToTree(50);
		tree_Operations.addElementToTree(30);
		tree_Operations.addElementToTree(60);
		tree_Operations.addElementToTree(15);
		tree_Operations.addElementToTree(45);
		tree_Operations.addElementToTree(55);
		tree_Operations.addElementToTree(75);
		tree_Operations.addElementToTree(10);
		tree_Operations.addElementToTree(20);
		tree_Operations.addElementToTree(9);
		tree_Operations.addElementToTree(12);
		tree_Operations.addElementToTree(40);
		tree_Operations.addElementToTree(48);

		tree_Operations.printTreeInorder();
//		tree_Operations.printTreePreorder();
		tree_Operations.printTreePreorder_alternate();
		

		tree_Operations.findElementInBST(20);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i=0;i<10;i++)
			arr.add(i+1);
		tree_Operations.createTreeWithMinHeight(arr);
		tree_Operations.BfsTraversal();
		
	}
	private void BfsTraversal() {
		Node current = root;
		if(current==null)
			System.out.println("Tree is null");
		else{
			
		}
			
	}
	private void createTreeWithMinHeight(ArrayList<Integer> arr) {
		Node current = root;
		
		for(int numberToAdd: arr){
			Node temp = new Node(numberToAdd);
			if(current==null){ 		//This is first element in the tree
				current = temp;
				current.left=null;
				current.right=null;
				root=temp;
			}
			else{
				Node traverserNode = null;
				while(current.left!=null){
					
				}
			}
		}
		
	}
	private void printTreePreorder_alternate() {
		System.out.println("Preorder - Alternate");
		Node currentNode = root;
		Stack<Node> treeStackNode = new Stack<Node>();
		
		treeStackNode.push(currentNode);
		while(!treeStackNode.isEmpty()){
			currentNode=treeStackNode.pop();
			System.out.println(currentNode.data);
			if(currentNode.right!=null){
				treeStackNode.push(currentNode.right);
			}
			if(currentNode.left!=null){
				treeStackNode.push(currentNode.left);
			}
		}
		
		
	}
	private void printTreePreorder() {
		System.out.println("Preorder: ");
		Node currentNode = root;
		if(currentNode==null){
			System.out.println("Tree is null. Sorry");
		}
		else{
			Stack<Node> treeNodeStack = new Stack<Node>();
			while(currentNode!=null){
				System.out.println(currentNode.data);
				treeNodeStack.push(currentNode);
				currentNode = currentNode.left;
			}
			while(!treeNodeStack.isEmpty()){
				currentNode = treeNodeStack.pop();
				if(currentNode.right!=null){
					currentNode = currentNode.right;
					System.out.println(currentNode.data);
					while(currentNode!=null){
						treeNodeStack.push(currentNode);
						currentNode = currentNode.left;
						if(currentNode!=null){
							treeNodeStack.push(currentNode);
							System.out.println(currentNode.data);
						}
					}
				}
			}
			
			
		}
	}
	private void printTreeInorder() {	// Left Child - Parent - Right Child
		System.out.println("Inorder: ");
		Node currentNode = root;
		if(currentNode==null){
			System.out.println("Tree is empty..Sorry");
		}
		else{
			Stack<Node> treeNodeStack = new Stack<Node>();
			while(currentNode!=null){		//Traverse to left most node of the tree while pushing each node on Stack 
				treeNodeStack.push(currentNode);
				currentNode = currentNode.left;
			}
			while(!treeNodeStack.isEmpty()){
				currentNode = treeNodeStack.pop();
				System.out.println(currentNode.data);
				if(currentNode.right!=null){
					currentNode = currentNode.right;
					while(currentNode!=null){
						treeNodeStack.push(currentNode);
						currentNode = currentNode.left;
					}
				}
			}
		}
	}
	private void addElementToTree(int dataToAdd) {
		Node temp = new Node(dataToAdd);
		Node currentNode = root;

		if(currentNode==null){ //New Node is the root of the tree
			currentNode = temp;
			currentNode.left=null;
			currentNode.right = null;
			root = currentNode;
		}
		else{	//Go to correct place for insertion
			while(currentNode.left!=null && currentNode.right!=null)
			{
				if(dataToAdd>currentNode.data)
					currentNode= currentNode.right;

				else if(dataToAdd<currentNode.data)
					currentNode = currentNode.left;

				else if(dataToAdd==currentNode.data)
				{
					System.out.println("Duplicate data found. Insertion not possible !");
					System.exit(0);
				}
			}
			if(dataToAdd<currentNode.data){	//insert to left
				currentNode.left= temp; 
				currentNode = currentNode.left;
			}
			else if(dataToAdd>currentNode.data){	//insert to right
				currentNode.right= temp;
				currentNode = currentNode.right;
			}
			currentNode.left = null;
			currentNode.right= null;

		}
	}
	private void findElementInBST(int dataToSearch) {
		
		Node currentNode = root;
		if(currentNode==null){		//Tree is null
			System.out.println("Tree is empty.");
		}
		else{		//Search for data in the tree 
			while(currentNode!=null){
				if(dataToSearch<currentNode.data) 	//Go to left 
					currentNode = currentNode.left;
				else if(dataToSearch>currentNode.data)	//Go to right
					currentNode = currentNode.right;
				else if(dataToSearch==currentNode.data){ //Data found
					System.out.println("Element " + dataToSearch + " exists");
					System.exit(0);
				}
			}
			System.out.println("Not Found !");
		}
	}
	public class Node{
		Node left;
		Node right;
		int data;

		public Node(int data){
			this.data = data;
		}

	}

}
