package linked_list;


public class LinkedList_deleteOperations {

	Node head;
	public LinkedList_deleteOperations(){
		head = null;	
	}

	public void deleteFromIndex(int index){
		Node nodeToDelete = null;
		Node current = head;
		int i=0;
		if (head==null)
			System.out.println("List is empty");
		else{
			while(i<index-1){
				if(current!=null){
					current = current.next;
					i++;
				}
				else{
					System.out.println("No data found at index");
					System.exit(0);
				}
				
			}
			nodeToDelete = current.next;
			if(nodeToDelete==null)
				System.out.println("No data found at index");
			else if (nodeToDelete.next == null){
				current.next = null;
				System.out.println("Value " + nodeToDelete.data  + " is deleted.");
			}
			else{
				current.next = nodeToDelete.next;
				System.out.println("Value " + nodeToDelete.data  + " is deleted.");
			}

		}

	}

	public void printList(){
		Node currentNode = head;
		while(currentNode.next!=null){
			System.out.print(currentNode.data+"-->");
			currentNode = currentNode.next;
		}
		System.out.print(currentNode.data+"-->null");
	}

	public void addToList(int newData){
		Node tempNode = new Node(newData);
		Node currentNode = head;
		if(head == null){
			head= tempNode;
			head.next=null;
		}
		else{
			while(currentNode.next!=null)
				currentNode = currentNode.next;
			currentNode.next = tempNode;
		}
	}

	class Node{
		Node next;
		int data;

		public Node(int data){
			next = null;
			this.data = data;
		}
	}
	public static void main(String[] args) {
		LinkedList_deleteOperations deleteOperations = new LinkedList_deleteOperations();

		deleteOperations.addToList(12);
		deleteOperations.addToList(11);
		deleteOperations.addToList(15);
		deleteOperations.addToList(18);
		deleteOperations.addToList(17);
		deleteOperations.addToList(16);
		deleteOperations.printList();
		
		deleteOperations.deleteFromIndex(5);
		deleteOperations.printList();
	}

}
