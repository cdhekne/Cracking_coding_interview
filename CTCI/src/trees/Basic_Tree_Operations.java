package trees;

public class Basic_Tree_Operations {

	Node root;

	public static void main(String []args){
		Basic_Tree_Operations tree_Operations = new Basic_Tree_Operations();
		
		tree_Operations.addElementToTree(50);
		tree_Operations.addElementToTree(30);
		tree_Operations.addElementToTree(60);
		tree_Operations.addElementToTree(15);
		tree_Operations.addElementToTree(45);
//		tree_Operations.printTree();
		
		
		
		
//		tree_Operations.findElementInBST(12);
	}
	private void printTree() {
		Node currentNode = root;
		while(currentNode!=null){
			
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
