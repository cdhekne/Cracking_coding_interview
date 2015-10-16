package linked_list;

public class LinkedList_basic {

	Node head;
	
	public LinkedList_basic(){
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
	
	/*public void addAtIndex(int newData, int index){
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
	}*/
	
	
	public static void main(String[] args) {
		LinkedList_basic list_basic = new LinkedList_basic();

		list_basic.addToList(12);
		list_basic.addToList(11);
		list_basic.addToList(15);
		list_basic.addToList(18);
		list_basic.addToList(17);
		list_basic.addToList(16);
		list_basic.printList();
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


