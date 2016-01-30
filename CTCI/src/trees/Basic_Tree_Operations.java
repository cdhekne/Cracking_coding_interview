package trees;

public class Basic_Tree_Operations {

	Node root;

	public static void main(String []args){
		Basic_Tree_Operations tree_Operations = new Basic_Tree_Operations();
		
		tree_Operations.addElementToTree(12);
		
		
		tree_Operations.findElementInBST(12);
	}
	private void addElementToTree(int dataToAdd) {
		
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
