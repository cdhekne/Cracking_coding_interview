package trees;

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
		tree_Operations.addElementToTree(12);
		tree_Operations.addElementToTree(40);
		tree_Operations.addElementToTree(48);

		tree_Operations.printTreeInorder();




		//		tree_Operations.findElementInBST(12);
	}
	private void printTreeInorder() {	// Left Child - Parent - Right Child
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
					currentNode = currentNode.left;
				else if(dataToSearch==currentNode.data) //Data found
					System.out.println("Element " + dataToSearch + "exists");
			}
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
