package linked_list;

public class LinkedList_addAtIndex {

	Node head;

	public LinkedList_addAtIndex() {
		head = null;
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

	public void printList(){
		Node currentNode = head;
		while(currentNode.next!=null){
			System.out.print(currentNode.data+"-->");
			currentNode = currentNode.next;
		}
		System.out.print(currentNode.data+"-->null");
	}

	public void addAtIndex(int newData, int index){
		Node tempNode = new Node(newData);
		Node currentNode = head;
		if(head==null && index>0){
			System.out.println("Invalid Index ");
			System.exit(0);
		}
		else if(head==null){
			head= tempNode;
			head.next=null;
		}
		else{
			int i=0;
			while(i<index-1){
				currentNode = currentNode.next;
				i+=1;
			}				
			tempNode.next = currentNode.next;
			currentNode.next = tempNode;
		}
	}

	public static void main(String[] args) {
		LinkedList_addAtIndex list_addAtIndex = new LinkedList_addAtIndex();

		list_addAtIndex.addToList(12);
		list_addAtIndex.addToList(11);
		list_addAtIndex.addToList(15);
		list_addAtIndex.addToList(18);
		list_addAtIndex.addToList(17);
		list_addAtIndex.addToList(16);
		//		list_basic.printList();

		list_addAtIndex.addAtIndex(21,3);
		list_addAtIndex.printList();
	}
	private class Node{
		Node next;
		int data;

		public Node(int d){
			next = null;
			data = d;
		}
	}
}