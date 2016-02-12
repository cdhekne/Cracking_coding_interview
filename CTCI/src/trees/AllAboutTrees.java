package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AllAboutTrees {

	TreeNode root;
	public AllAboutTrees(){
		this.root=null;
	}

	public static void main(String[] args){

		AllAboutTrees trees = new AllAboutTrees();
		trees.root=trees.addToTree(50,trees.root);
		trees.root=trees.addToTree(30,trees.root);
		trees.root=trees.addToTree(60,trees.root);
		trees.root=trees.addToTree(15,trees.root);
		trees.root=trees.addToTree(45,trees.root);
		trees.root=trees.addToTree(55,trees.root);
		trees.root=trees.addToTree(75,trees.root);
		trees.root=trees.addToTree(10,trees.root);
		trees.root=trees.addToTree(20,trees.root);
		trees.root=trees.addToTree(9,trees.root);
		trees.root=trees.addToTree(12,trees.root);
		trees.root=trees.addToTree(40,trees.root);
		trees.root=trees.addToTree(48,trees.root);

		trees.inorderTraversal();
		int arr[] = new int[]{1,2,3,4,5,6,7,8,9};
		trees.BFSTraversal();
		System.out.println();
		trees.DFSTraversal();

		AllAboutTrees trees1 = new AllAboutTrees();
		TreeNode r = trees1.ctci4_3(arr,0, arr.length-1);
		trees1.inorderTraversal();
	}


	/* Given a array of sorted data.
	 * Create a binary tree with minimal height
	 */

	private void DFSTraversal() {
		Stack<TreeNode> stackForDFS = new Stack<TreeNode>();
		if(root==null)
			return;
		stackForDFS.push(root);
		while(!stackForDFS.isEmpty()){
			TreeNode temp = stackForDFS.pop();
			System.out.print(" " +temp.data);
			if(temp.right!=null)
				stackForDFS.push(temp.right);
			if(temp.left!=null)
				stackForDFS.push(temp.left);
		}
	}

	private void BFSTraversal() {
		Queue<TreeNode> queueForBFS = new LinkedList<TreeNode>();
		
		if(root==null)
			return;
		queueForBFS.add(root);
		while(!queueForBFS.isEmpty()){
			TreeNode temp = queueForBFS.poll();
			System.out.print(" "+ temp.data);
			if(temp.left!=null)
				queueForBFS.add(temp.left);
			if(temp.right!=null)
				queueForBFS.add(temp.right);
		}
	}

	private TreeNode ctci4_3(int[] arr, int start, int end) {
		
		if(end<start)
			return null;
		int mid = (start+end)/2;
		TreeNode node = new TreeNode(arr[mid]);
		node.left = ctci4_3(arr, start, mid-1);
		node.right = ctci4_3(arr, mid+1, end);
		
		return node;
	}

	private void inorderTraversal() {

		Stack<TreeNode> inorderStack = new Stack<TreeNode>();

		TreeNode temp = root;
		while(temp!=null){
			inorderStack.push(temp);
			temp= temp.left;
		}
		while(!inorderStack.isEmpty()){
			temp = inorderStack.pop();
			System.out.println(temp.data);
			if(temp.right!=null){
				temp =temp.right;
				while(temp!=null){
					inorderStack.push(temp);
					temp = temp.left;
				}
			}
		}

	}

	private TreeNode addToTree(int data, TreeNode rootNode) {
		
		if(rootNode==null){
			rootNode = new TreeNode(data);
		}
		else{
			if(data<rootNode.data)
				rootNode.left = addToTree(data, rootNode.left);
			else
				rootNode.right = addToTree(data, rootNode.right);
		}
		return rootNode;
			
	}

	private class TreeNode{

		TreeNode right;
		TreeNode left;
		int data;

		public TreeNode(int data){
			this.data = data;
			this.left=null;
			this.right=null;
		}


	}

}
